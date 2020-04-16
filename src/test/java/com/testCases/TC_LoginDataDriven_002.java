package com.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utilities.XLUtils;
import com.pageObjects.LoginPage;

public class TC_LoginDataDriven_002 extends BaseClass {
	
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) throws IOException 
	{
		LoginPage logintest = PageFactory.initElements(driver, LoginPage.class);
		driver.get(URL);
		logintest.getuserId().sendKeys(user);
		logger.info("--Username provided--");
		logintest.getpassword().sendKeys(pwd);
		logger.info("--Password provided--");
		logintest.getloginbtn().click();
		
		if(isAlertPresent() == true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			captureScreen(driver, "loginDDT");
			Assert.assertTrue(false);
			logger.warn("-- Login Failed--");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("-- Login passed--");
			logintest.getlogoutbtn().click();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
		
	}
	
	
	
	// ** Method to check the alert presence
	public boolean isAlertPresent() {
		
		try 
		{
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}

	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException {
		
		String path = System.getProperty("user.dir") + "/src/test/java/com/testData/LoginData.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
		
		return logindata;
		
	}
	
}
