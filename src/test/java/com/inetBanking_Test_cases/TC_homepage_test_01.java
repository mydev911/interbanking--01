package com.inetBanking_Test_cases;

import org.testng.annotations.Test;


import com.inetBanking_Page_Object.Home_Page;

public class TC_homepage_test_01 extends Base_Class {
	
	@Test
	public void practic_page() {
		
		logger.info("URl is open");
		
		Home_Page hp = new Home_Page(driver);
		hp.PracticPage_Click();
		
		logger.info("Practic page click");
		
		System.out.println("homepage title is =" +driver.getTitle());
		logger.info("Get the title");
		
		
	}
	

}
