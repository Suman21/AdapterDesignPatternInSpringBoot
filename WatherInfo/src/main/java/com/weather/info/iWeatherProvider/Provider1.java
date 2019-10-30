package com.weather.info.iWeatherProvider;

public interface Provider1 {

     public double getTemp();
     public double getHumidity();
     public double getWindSpeed();

     public void setTemp(double temp);
     public void setHumidity(double humidity);
     public void setWindSpeed(double windSpeed);
}