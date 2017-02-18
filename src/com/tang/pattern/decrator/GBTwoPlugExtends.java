package com.tang.pattern.decrator;

public class GBTwoPlugExtends extends GBTwoPlug implements ThreePlugIf
{
	
	public void powerWithThree()
	{
		// TODO Auto-generated method stub
		System.out.print("通过继承使用二相电流");
		this.powerWithTwo();
	}

	
}
