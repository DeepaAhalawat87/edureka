package com.edureka.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {

	
	static FileInputStream fis;
	static Properties p;
	public static String  getPropertyValue(String key) throws Throwable 
	{
		
		fis= new FileInputStream("./PropertyFiles/config.properties");
		
		p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
		
	}
}
