package com.headfirst.observer;

import java.util.ArrayList;

public class WeatherData implements Subject
{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	public WeatherData()
	{
		observers=new ArrayList<Observer>();
	}
	public void registerObserver(Observer o)
	{
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	public void deleteObserver(Observer o)
	{
		// TODO Auto-generated method stub
		int i=observers.indexOf(o);
		if(i>0){
			observers.remove(i);
			}		
	}
	/**
	 * 通知观察者
	 */
	public void notifyObservers()
	{
		// TODO Auto-generated method stub
		for (int i=0 ;i<observers.size();i++)
		{
			Observer obs=(Observer) observers.get(i);
			obs.update(temperature, humidity, pressure);
		}
		
	}
	/**
	 * 数据变化后通知观察者
	 */
	public void measurementsChanged()
	{
		notifyObservers();
	}
	/**
	 * 模拟气象监测
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature,float humidity,float pressure)
	{
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		this.measurementsChanged();
	}
	
}
