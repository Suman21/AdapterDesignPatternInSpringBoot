package com.weather.info.impl;

import com.weather.info.iWeatherProvider.Provider1;
import com.weather.info.iWeatherProvider.Provider2;

public class P1toP2Adapter implements Provider2 {

    private double t;
    private double h;
    private double ws;
    private final Provider1 p1;
    public P1toP2Adapter(Provider1 p)
    {
        p1 = p;
        setProp();
    }
    @Override
    public double getT() {
        return t;
    }

    @Override
    public double getH() {
        return h;
    }

    @Override
    public double getWS() {
        return ws;
    }

    @Override
    public void setT(double t) {
        this.t = t;
    }

    @Override
    public void setH(double h) {
        this.h = h;
    }

    @Override
    public void setWS(double ws) {
        this.ws = ws;
    }

    public void setProp()
    {
        setT(p1.getTemp());
        setH(p1.getHumidity());
        setWS(p1.getWindSpeed());
    }

    public String toString()
    {
        return t+" "+h+" "+ws;
    }
}