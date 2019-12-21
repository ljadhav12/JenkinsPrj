package example;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.Logs;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	private WebDriver driver;	
	
	private static Logger Log = Logger.getLogger(Logs.class.getName());
	@Test				
	public void testEasy() {
		
		driver.get("https://accounts.google.com/signin");  
		 Log.info("Web application launched");
		String title = driver.getTitle();
		 Log.info("Web application launched"+ title);
		Assert.assertTrue(title.contains("Sign in - Google Accounts")); 		
	}	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\" + "chromedriver.exe");
		driver = new ChromeDriver();
		
		 Log.info("New driver instantiated");
		
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}
	
	
	

}
