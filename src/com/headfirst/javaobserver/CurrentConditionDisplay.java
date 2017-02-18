package com.headfirst.javaobserver;
import java.util.Observable;
import java.util.Observer;
public class CurrentConditionDisplay implements Observer,DisplayElement
{
	private float temperature;
	private float humidity;
	Observable observable; 

	public void update(Observable o, Object arg)
	{
		// TODO Auto-generated method stub
		if(o instanceof WeatherData)
		{
			this.temperature=((WeatherData) o).getTemperature();
			this.humidity=((WeatherData) o).getHumidity();
			display();
		}
	} 
	public CurrentConditionDisplay(Observable observable)
	{
		this.observable=observable;
		observable.addObserver(this);
	}
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println("当前的温度："+this.temperature+"度\t 当前湿度："+this.humidity+"%");
	}
	

}
