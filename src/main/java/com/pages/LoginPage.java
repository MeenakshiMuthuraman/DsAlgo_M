package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//1. By Locators;
	
	private By username = By.id("id_username");
	private By password = By.id("id_password");
	private By loginButton = By.xpath("//input[@value='Login']");
	private By registerLink = By.linkText("Register!");

	//2.Constructor of the page class:
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//3. page actions: features(behavior) of the page the form of methods
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean isRegisterLinkExist()
	{
		return driver.findElement(registerLink).isDisplayed();
	}
	public void enterUserName(String usernameValue)
	{
		driver.findElement(username).sendKeys(usernameValue);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		driver.findElement(loginButton).click();
	}
	public void doLogin(String uname, String pwd)
	{
		System.out.println("Logged in with "+uname+","+pwd);
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();

	}

}
