package com.tang.pattern.decrator;

public class GBTwoPlugExtends extends GBTwoPlug implements ThreePlugIf
{
	
	public void powerWithThree()
	{
		// TODO Auto-generated method stub
		System.out.print("ͨ���̳�ʹ�ö������");
		this.powerWithTwo();
	}

	
}
