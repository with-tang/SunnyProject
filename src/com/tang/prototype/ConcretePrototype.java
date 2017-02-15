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
	// 覆盖Object基类中的clone()方法，并扩大该方法的访问权限，具体化返回本类型  
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
		ConcretePrototype prototype=new ConcretePrototype("调用原型方法");
		 // 通过clone获取一个拷贝  
        System.out.println(prototype.getNameList());  
        ConcretePrototype fromClone=prototype.clone();
        fromClone.setName("拷贝原型方法");
        System.out.println(fromClone.getNameList());
        System.out.println(prototype==fromClone);
	}
}
