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
		int n;
		for( n=0;n<100;n=n*2+1);
		System.out.println(n);
		

	}

}
