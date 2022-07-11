package org.example.YW;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Info {
    private String url;
    private float lat;
    private float lon;


    // Getter Methods

    public String getUrl() {
        return url;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    // Setter Methods

    public void setUrl(String url) {
        this.url = url;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

}
