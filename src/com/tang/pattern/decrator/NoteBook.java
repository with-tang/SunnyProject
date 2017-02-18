package com.tang.pattern.decrator;

public class NoteBook
{
	public ThreePlugIf three;
	public NoteBook(ThreePlugIf three)
	{
		this.three=three;		
	}
	public void charge()
	{
		three.powerWithThree();
	}
	public static void main(String[] args)
	{
		//组合方式
		GBTwoPlug two=new GBTwoPlug();
		ThreePlugIf three= new TwoPlugAdapter(two);
		NoteBook nb=new NoteBook(three);
		nb.charge();
		
		//继承方式
		three=new GBTwoPlugExtends();		
		nb=new NoteBook(three);
		nb.charge();
	}
}
