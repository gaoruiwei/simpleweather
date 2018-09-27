package com.example.simpleweather.gson;

/**
 * Created by gaoruiwei on 2018/9/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
