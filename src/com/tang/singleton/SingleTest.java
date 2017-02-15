package com.tang.singleton;

public class SingleTest
{

	public static void main(String[] args)
	{
		SingleDemo s1=null;
		SingleDemo s2=null;
		s1=SingleDemo.getSingle();
		s2=SingleDemo.getSingle();
		System.out.println(s1==s2);
		System.out.println(s1.toString()+"\n"+s2.toString());
	}

}
