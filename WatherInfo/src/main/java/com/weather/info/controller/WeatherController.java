package com.weather.info.controller;

import com.weather.info.iWeatherProvider.Provider1;
import com.weather.info.iWeatherProvider.Provider2;
import com.weather.info.impl.P1toP2Adapter;
import com.weather.info.impl.Provider1Impl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @RequestMapping(value = "/weather")
    public String getWeather()
    {
        Provider1 p1 = new Provider1Impl();
        p1.setTemp(1);
        p1.setHumidity(2);
        p1.setWindSpeed(3);
        Provider2 p2 = new P1toP2Adapter(p1);
        return p2.toString();
    }
}