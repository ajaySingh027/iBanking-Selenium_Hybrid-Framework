package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}catch (Exception e) {
			System.out.println("Exception is: ---" + e.getMessage());
		}
	}
	
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("URL");
		return url;
	}
	
	
	public String getUserId()
	{
		String userid = pro.getProperty("userid");
		return userid;
	}
	
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	
	public String getFirefoxPath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

}


