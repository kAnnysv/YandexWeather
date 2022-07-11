package org.example.YW;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Fact {
    private float obs_time;
    private float temp;
    private float feels_like;
    private float temp_water;
    private String icon;
    private String condition;
    private float wind_speed;
    private String wind_dir;
    private float pressure_mm;
    private float pressure_pa;
    private float humidity;
    private String daytime;
    private boolean polar;
    private String season;
    private float wind_gust;


    // Getter Methods

    public float getObs_time() {
        return obs_time;
    }

    public float getTemp() {
        return temp;
    }

    public float getFeels_like() {
        return feels_like;
    }

    public float getTemp_water() {
        return temp_water;
    }

    public String getIcon() {
        return icon;
    }

    public String getCondition() {
        return condition;
    }

    public float getWind_speed() {
        return wind_speed;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public float getPressure_mm() {
        return pressure_mm;
    }

    public float getPressure_pa() {
        return pressure_pa;
    }

    public float getHumidity() {
        return humidity;
    }

    public String getDaytime() {
        return daytime;
    }

    public boolean getPolar() {
        return polar;
    }

    public String getSeason() {
        return season;
    }

    public float getWind_gust() {
        return wind_gust;
    }

    // Setter Methods

    public void setObs_time(float obs_time) {
        this.obs_time = obs_time;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setFeels_like(float feels_like) {
        this.feels_like = feels_like;
    }

    public void setTemp_water(float temp_water) {
        this.temp_water = temp_water;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setWind_speed(float wind_speed) {
        this.wind_speed = wind_speed;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public void setPressure_mm(float pressure_mm) {
        this.pressure_mm = pressure_mm;
    }

    public void setPressure_pa(float pressure_pa) {
        this.pressure_pa = pressure_pa;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public void setPolar(boolean polar) {
        this.polar = polar;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setWind_gust(float wind_gust) {
        this.wind_gust = wind_gust;
    }
}


