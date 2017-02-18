package com.headfirst.observer;

public class CurrentConditionsDisplay implements Observer, DisplayMent
{
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	public CurrentConditionsDisplay(Subject weatherData)
	{
		this.weatherData=weatherData;
		weatherData.registerObserver(this);	
	}
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println("��ǰ���¶ȣ�"+this.temperature+"��\t ��ǰʪ�ȣ�"+this.humidity+"%");
	}

	public void update(float temperature, float humidity, float pressure)
	{
		// TODO Auto-generated method stub
		this.temperature=temperature;
		this.humidity=humidity;		
		display();

	}

}
