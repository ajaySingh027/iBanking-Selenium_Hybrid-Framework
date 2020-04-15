package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String URl = "http://demo.guru99.com/v4/index.php";
	public String userid = "mngr255784";
	public String password = "esYnezY";
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
