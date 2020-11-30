package com.interBanking_Test_Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File source = new File("./Configration\\config.properties");
		
		try {
			FileInputStream files = new FileInputStream(source);
			
			pro = new Properties();
			pro.load(files);
		} catch (IOException e) {
			System.out.println("Exception is  " +e.getMessage());
		}
	}
	public String getApplicationURL() 
	{
		String url = pro.getProperty("BaseURL");
		return url;
		
	}
	
	public String  GetFireFoxPath() 
	{   String firefoxpath = pro.getProperty("firefoxpath ");
	
		return firefoxpath ;
		
	}
	
	

}
