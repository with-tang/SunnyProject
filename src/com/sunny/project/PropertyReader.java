package com.sunny.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyReader
{
	/**
	 * ¶ÁÈ¡propertiesÎÄ¼þ
	 * @return
	 * @throws IOException
	 */
public static  Map<String,String>  getPeroperties() throws IOException
{
	 Map<String,String> map=new HashMap();
	 InputStream in;
	try
	{
		in= PropertyReader.class.getResourceAsStream("type.properties");
		//in =new FileInputStream("type.properties");
		Properties prop = new Properties();
		prop.load(in);
		
		Enumeration en=prop.propertyNames();
		while(en.hasMoreElements())
		{
			String key=(String) en.nextElement();
			String property=prop.getProperty(key);
			map.put(key, property);
		}
		return map;
	}
	catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}	
}
}
