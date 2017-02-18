package com.headfirst.duck;

public class YellowDuck extends Duck
{

	public YellowDuck()
	{
		flyBehavior=new FlyWithWings();
		quackBehavior=new NoQuack();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Duck yellowDuck=new YellowDuck();
		yellowDuck.performFly();
		yellowDuck.performQuack();
	}

	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		
	}
	
}
