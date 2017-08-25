package com.kongl.cxf.service;

public class WeatherInterfaceImpl implements WeatherInterface{

	public String queryWeather(String cityName) throws Exception {
		System.out.println("hello world");
		return cityName+"晴";
	}

}
