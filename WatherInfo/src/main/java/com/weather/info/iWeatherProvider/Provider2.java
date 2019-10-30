package com.weather.info.iWeatherProvider;

public interface Provider2 {

    public double getT();
    public double getH();
    public double getWS();

    public void setT(double t);
    public void setH(double h);
    public void setWS(double ws);
}