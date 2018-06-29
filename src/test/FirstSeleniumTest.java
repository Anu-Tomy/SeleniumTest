package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	
	public static void main(String[] args) {
		
		//Specify the driver type and its location
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tomya\\eclipse-workspace\\geckodriver.exe");
		
		//Create an object of the webdriver
		WebDriver driver = new FirefoxDriver();		
			
		//navigation
		driver.get("http://www.seleniumhq.org/");
		
		
		driver.quit();
	}
	

}
