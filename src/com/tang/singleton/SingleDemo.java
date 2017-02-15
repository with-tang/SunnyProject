package com.tang.singleton;

public class SingleDemo
{
	private SingleDemo(){};
	
	//method 1
	/*private static SingleDemo single=new SingleDemo();
	public static  SingleDemo getSingle()
	{
		return single;
	}
	 *
	 */
	//method2
	private static SingleDemo single;
	public static   SingleDemo getSingle()
	{
		synchronized(SingleDemo.class){
			if (single==null)
				{
					if(single==null){
					single=new SingleDemo();}	
					return single;
				}
			else  return single;
		}
		
	}
}
