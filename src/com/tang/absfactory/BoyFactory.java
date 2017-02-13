package com.tang.absfactory;

public class BoyFactory
{
	public static Boy getBoy(String type)
	{
		if("HNBoy".equals(type)){
			return new HNBoy();
		}
		else if("MCMBoy".equals(type))
		{
			return new MCMBoy();
		}
		else return null;
	}
}
