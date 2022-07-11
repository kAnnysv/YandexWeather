package org.example.YW;


import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

// API Яндекс.Погоды  Отправляем широту и долготу местности, получаем текущую погоду

public class ExampleMain {

    static Properties prop = new Properties();


    public static void main(String[] args) throws IOException {

        loadProperties();

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(prop.getProperty("HOST"))
                .addPathSegment("v2")
                .addPathSegment("informers")
                .addQueryParameter("lat",prop.getProperty("LAT"))
                .addQueryParameter("lon", prop.getProperty("LON"))
                .build();
//        System.out.println(url.toString());

        Request request = new Request.Builder()
                .addHeader("X-Yandex-API-Key", prop.getProperty("API_KEY"))
                .url(url)
                .build();

        String jsonResponse = client.newCall(request).execute().body().string();
//        System.out.println(jsonResponse);
        ObjectMapper mapper = new ObjectMapper();
        StringReader reader = new StringReader(jsonResponse);
        Codebeautify codebeautify = mapper.readValue(reader, Codebeautify.class);
        System.out.println("Сегодня > " + codebeautify.getNow_dt());
        System.out.println("Санкт Петербург > " + codebeautify.getFact().getTemp() + " C");







    }
    private static void loadProperties() throws IOException {
        try (FileInputStream configFile = new FileInputStream("src/main/resources/yw.properties")) {
            prop.load(configFile);

        }
    }
}
