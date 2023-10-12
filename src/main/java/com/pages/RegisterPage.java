package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	
private WebDriver driver;

	
	
	//1. By Locators;
	
	private By username = By.id("id_username");
	private By password = By.id("id_password1");
	private By confirmpwd = By.id("id_password2");
	private By registerButton = By.xpath("//input[@value='Register']");
	private String alertmsg = "password_mismatch:The two password fields didn’t match";
	private String registerUrl = "https://dsportalapp.herokuapp.com/register";
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void getRegisterPage()
	{
		driver.get(registerUrl);
	}
	public void clickOnRegister()
	{
		driver.findElement(registerButton).click();
	}
	
}
