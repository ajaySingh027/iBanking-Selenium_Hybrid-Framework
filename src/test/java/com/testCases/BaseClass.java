package com.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String URL = "http://demo.guru99.com/v4/index.php";
	public String userid = "mngr255784";
	public String password = "esYnezY";
	public static WebDriver driver=null;
	
	
	@BeforeClass
	public void setup() {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/sneharoy/eclipse-workspace/InetBankingV1/Drivers/geckodriver");
		System.setProperty("webdriver.gecko.driver", "/Users/sneharoy/eclipse-workspace/OnlineStore/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
