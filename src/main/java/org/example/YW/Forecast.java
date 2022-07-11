package org.example.YW;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Forecast {
    private String date;
    private float date_ts;
    private float week;
    private String sunrise;
    private String sunset;
    private float moon_code;
    private String moon_text;
    ArrayList< Object > parts = new ArrayList < Object > ();


    // Getter Methods

    public String getDate() {
        return date;
    }

    public float getDate_ts() {
        return date_ts;
    }

    public float getWeek() {
        return week;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public float getMoon_code() {
        return moon_code;
    }

    public String getMoon_text() {
        return moon_text;
    }

    // Setter Methods

    public void setDate(String date) {
        this.date = date;
    }

    public void setDate_ts(float date_ts) {
        this.date_ts = date_ts;
    }

    public void setWeek(float week) {
        this.week = week;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public void setMoon_code(float moon_code) {
        this.moon_code = moon_code;
    }

    public void setMoon_text(String moon_text) {
        this.moon_text = moon_text;
    }
}


