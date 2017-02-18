package com.headfirst.observer;

public class WeatherStation
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 WeatherData weatherData=new WeatherData();
		 CurrentConditionsDisplay ccd=new CurrentConditionsDisplay(weatherData);
		 weatherData.setMeasurements(23, 20, 30);		
	}

}
