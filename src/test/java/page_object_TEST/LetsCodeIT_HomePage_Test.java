package page_object_TEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page_object_model.LetsCodeIt_home_page01;

public class LetsCodeIT_HomePage_Test {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		Lets_code_HomePage();
		
	}
	
	public static void Lets_code_HomePage() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swapon\\eclipse-workspace\\selenium-project-03\\Newfolder\\operating system\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		LetsCodeIt_home_page01 practic_page = new LetsCodeIt_home_page01(driver);
		
		driver.get("https://letskodeit.teachable.com/");
		practic_page.PracticPage_Click();
	}
	

}
