package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tomya\\eclipse-workspace\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();		
			
		driver.get("http://www.seleniumhq.org/");
		
		driver.quit();
	}
	

}
