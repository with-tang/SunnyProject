package com.tang.pattern.decrator;

public class TwoPlugAdapter implements ThreePlugIf
{ 
	public void powerWithThree(){
		
		System.out.println("ͨ��ת����ʹ�ö����������");
		gbtwo.powerWithTwo();
	};
	private GBTwoPlug gbtwo;
	public  TwoPlugAdapter(GBTwoPlug two)
	{
		this.gbtwo=two;
	}
}
