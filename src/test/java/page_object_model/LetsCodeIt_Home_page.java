package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LetsCodeIt_Home_page {
	
	private static WebElement element = null;
	public static  WebElement practic_page(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link']"));
		return element;
	
	}
	
	public static WebElement ligin_page (WebDriver driver) {
		element =driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
		
		return element;
		
	}
	

}
