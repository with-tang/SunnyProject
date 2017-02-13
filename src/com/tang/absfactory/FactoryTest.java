package com.tang.absfactory;

public class FactoryTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Boy boy=BoyFactory.getBoy("HNBoy");
		boy.say();
		Girl girl=GirlFactory.getGirl("MCMGirl");
		girl.say();
	}

}
