package com.inetBanking_Test_cases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.interBanking_Test_Utilites.ReadConfig;

public class Base_Class {
	
	ReadConfig readconfig = new ReadConfig();
	
     public static Logger logger;
	
	public String URL = readconfig.getApplicationURL();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j2.properties");
		
		//System.setProperty("webdriver.gecko.driver", readconfig.GetFireFoxPath());
		if(br.equals("firefox"))
		{ 
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		/*else if(br.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		    driver = new ChromeDriver();
			
		}
		
	/*else if(br.equals("ie")) {
			
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
			
		}*/
		driver.get(URL);
		
		
		}
	
	
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
