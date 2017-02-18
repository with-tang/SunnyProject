package com.headfirst.javaobserver;

public class WeatherStation
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 WeatherData weatherData=new WeatherData();
		 CurrentConditionDisplay ccd=new CurrentConditionDisplay(weatherData);
		 weatherData.setMeasurements(23, 10, 30);		

	}

}
