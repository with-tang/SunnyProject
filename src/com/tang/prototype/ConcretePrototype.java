package com.tang.prototype;

import java.util.ArrayList;

public class ConcretePrototype implements Cloneable
{
	private String name;
	private ArrayList<String> nameList=new ArrayList<String>();
	
	public ConcretePrototype(String name)
	{
		this.name=name;
		nameList.add(name);
	}
	public void setName(String name)
	{
		nameList.add(name);
	}
	public ArrayList<String> getNameList()
	{
		return this.nameList;
	}
	// ����Object�����е�clone()������������÷����ķ���Ȩ�ޣ����廯���ر�����  
	public ConcretePrototype clone()
	{
		try{
			return (ConcretePrototype)super.clone();
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	public static void main(String[] args)
	{
		ConcretePrototype prototype=new ConcretePrototype("����ԭ�ͷ���");
		 // ͨ��clone��ȡһ������  
        System.out.println(prototype.getNameList());  
        ConcretePrototype fromClone=prototype.clone();
        fromClone.setName("����ԭ�ͷ���");
        System.out.println(fromClone.getNameList());
        System.out.println(prototype==fromClone);
	}
}
