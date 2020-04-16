package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	// Login username field
	@FindBy(name="uid")
	private WebElement userId;
	public WebElement getuserId() {
		return userId;
	}
	
	
	// Login Password field
	@FindBy(name="password")
	private WebElement password;
	public WebElement getpassword() {
		return password;
	}
	
	
	// Login button
	@FindBy(name="btnLogin")
	private WebElement loginbtn;
	public WebElement getloginbtn() {
		return loginbtn;
	}
	
	
	// Logout button
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	private WebElement logoutbtn;
	public WebElement getlogoutbtn() {
		return logoutbtn;
	}

}
