package com.weather.info.impl;

import com.weather.info.iWeatherProvider.Provider1;

public class Provider1Impl implements Provider1 {

    private double temp;
    private double humidity;
    private double windSpeed;

    @Override
    public double getTemp() {
        return temp;
    }

    @Override
    public double getHumidity() {
        return humidity;
    }

    @Override
    public double getWindSpeed() {
        return windSpeed;
    }

    @Override
    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String toString()
    {
        return temp+" "+humidity+" "+windSpeed;
    }
}