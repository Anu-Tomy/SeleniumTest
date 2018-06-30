package test;


import org.openqa.selenium.WebDriver;


public class ChromeDriver {

	public static void main(String[] args) throws Exception {
		
		String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://www.seleniumhq.org/");
					
		//wait
		Thread.sleep(5000);
		
		driver.close();
	}

}
