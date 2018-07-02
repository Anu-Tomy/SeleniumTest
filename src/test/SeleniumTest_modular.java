package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest_modular {
	
	static String browser;
	static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		
		setBrowser();
		setBrowserConfig();
		runTest();		
		
	}
	
	public static void setBrowser() {	 
		
		browser = "Chrome";
	    
	}
		
	public static void setBrowserConfig() {
		
		String projectLocation = System.getProperty("user.dir");
		
		if (browser.contains("Firefox")) {			
			System.setProperty("webdriver.gecko.driver", projectLocation + "\\lib\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}
		
		else if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\chromedriver\\chromedriver.exe");
			driver = new org.openqa.selenium.chrome.ChromeDriver();
		}
	}
	
	public static void runTest() throws InterruptedException {
		
		driver.get("http://www.seleniumhq.org/");
		
		//wait
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
	
	
