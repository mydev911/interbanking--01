package com.inetBanking_Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
	
	
WebDriver driver =null;
	
	By practice_Text = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
	By Login_Text = By.xpath("//a[@class='navbar-link fedora-navbar-link']");
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void PracticPage_Click () {
		driver.findElement(practice_Text).click();
		
		
	}
	public void LoginPage_Click() {
		driver.findElement(Login_Text).click();
	}
	

}
