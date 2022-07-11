package org.example.YW;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Codebeautify {
    private float now;
    private String now_dt;
    Info InfoObject;
    Fact FactObject;
    Forecast ForecastObject;


    // Getter Methods

    public float getNow() {
        return now;
    }

    public String getNow_dt() {
        return now_dt;
    }

    public Info getInfo() {
        return InfoObject;
    }

    public Fact getFact() {
        return FactObject;
    }

    public Forecast getForecast() {
        return ForecastObject;
    }

    // Setter Methods

    public void setNow(float now) {
        this.now = now;
    }

    public void setNow_dt(String now_dt) {
        this.now_dt = now_dt;
    }

    public void setInfo(Info infoObject) {
        this.InfoObject = infoObject;
    }

    public void setFact(Fact factObject) {
        this.FactObject = factObject;
    }

    public void setForecast(Forecast forecastObject) {
        this.ForecastObject = forecastObject;
    }
}

