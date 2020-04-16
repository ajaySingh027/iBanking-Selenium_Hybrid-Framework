package com.testCases;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void logintest()
	{
		try {
				
			LoginPage logintest = PageFactory.initElements(driver, LoginPage.class);
			driver.get(URL);
			logger.info("-- Starting the login--");
			
			logintest.getuserId().sendKeys(userid);
			logintest.getpassword().sendKeys(password);
			logintest.getloginbtn().click();
			logger.info("-- Login completed here-- ");
			Thread.sleep(1000);
			
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				logger.info("--Login test passed--");
			}
			else
			{
				captureScreen(driver, "logintest");
				Assert.assertTrue(false);
				logger.info("--Login test Failed--");
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
