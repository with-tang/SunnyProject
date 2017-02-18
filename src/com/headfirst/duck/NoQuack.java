package com.headfirst.duck;

public class NoQuack implements QuackBehavior
{
	public void quack()
	{
		System.out.println("I am a duck can't quack");
	}
}
