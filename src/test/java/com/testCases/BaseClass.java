package com.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String URL = readconfig.getApplicationURL();
	public String userid = readconfig.getUserId();
	public String password = readconfig.getPassword();
	public static WebDriver driver=null;
	public static Logger logger;
	
	
	@BeforeClass
	public void setup() {
		
//		System.setProperty("webdriver.gecko.driver", "/Users/sneharoy/eclipse-workspace/InetBankingV1/Drivers/geckodriver");
		System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
	}

	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
