package com.sunny.project;

import java.io.IOException;
import java.util.Map;

public class HairFactoryTest
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		HairInterface hair=HairFactory.getHairByKey("in");
		hair.draw();
		
		
		
	}

}
