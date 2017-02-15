package com.tang.pattern.decrator;

public class TwoPlugAdapter implements ThreePlugIf
{ 
	public void powerWithThree(){
		
		System.out.println("通过转化，使用二相电流供电");
		gbtwo.powerWithTwo();
	};
	private GBTwoPlug gbtwo;
	public  TwoPlugAdapter(GBTwoPlug two)
	{
		this.gbtwo=two;
	}
}
