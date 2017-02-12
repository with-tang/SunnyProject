package com.sunny.project;

import java.io.IOException;
import java.util.Map;

public class HairFactory
{
	/**
	 * ͨ��ԭʼ�ıȽ������ɶ���
	 * @param key
	 * @return
	 */
	public static HairInterface getHair(String key)
	{
		if("left".equals(key)){
			return new LeftHair();
		}
		else if("right".equals(key))
		{
			return new RightHair();
		}
		else return null;
			
	}
	/**
	 * ���÷����������������
	 * @param className
	 * @return
	 */
	public static HairInterface getHairByClass(String className)
	{
		try
		{
			return  (HairInterface) Class.forName(className).newInstance();
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}
	/**
	 *ͨ����ȡpropertiesӳ����߷����Ŀɶ��� 
	 * @param key
	 * @return
	 * @throws IOException 
	 */
	public static HairInterface getHairByKey(String key) throws IOException
	{
		try
		{
			Map<String,String> map= PropertyReader.getPeroperties();
			String value=map.get(key);
			return  (HairInterface) Class.forName(value).newInstance();
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}
}
