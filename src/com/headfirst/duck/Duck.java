package com.headfirst.duck;

public abstract class Duck
{
	public Duck(){}
	 FlyBehavior flyBehavior;
	 QuackBehavior quackBehavior;
	 public abstract void display();
	 public void  performQuack()
	 {
		 quackBehavior.quack();
	 }
	 public void performFly()
	 {
		 flyBehavior.fly();
	 }
	 public void swim()
	 {
		 System.out.println("所有的鸭子都会漂浮，即使是假的");
	 }
}
