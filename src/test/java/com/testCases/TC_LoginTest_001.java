package com.testCases;

import org.apache.log4j.Logger;
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
			logintest.getuserId().sendKeys(userid);
			logintest.getpassword().sendKeys(password);
			logintest.getloginbtn().click();
			logger.info("-- Login completed here-- ");
			Thread.sleep(2000);

		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
