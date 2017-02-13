package com.tang.absfactory;

public class GirlFactory

{
	public static Girl getGirl(String type)
	{
		if("HNGirl".equals(type)){
			return new HNGirl();
		}
		else if("MCMGirl".equals(type))
		{
			return new MCMGirl();
		}
		else return null;
	}
}
