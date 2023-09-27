package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.Constants;

public class StackPage {
	
	private WebDriver driver;
	
	
	private By operationInStack_main = By.xpath("//a[@href='operations-in-stack']");
	private By implementation_main = By.xpath("//a[@href='implementation']");
	private By applications_main = By.linkText("Applications");
//	private By operationInStack_sub = By.xpath("//a[@href='/stack/operations-in-stack/']");
//	private By implementation_sub = By.xpath("//a[@href='/stack/implementation/']");
//	private By applications_sub = By.xpath("//a[@href='/stack/stack-applications/']");
//	private By tryhereLink = By.xpath("//a[@href='/tryEditor']");
	private By tryherelink = By.linkText("Try here>>>");
//	private By runbutton = By.xpath("//button[contains(text(),'Run')]");
	private By tryeditor = By.xpath("//div[@class='input'] ");


	
	
	public StackPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigatethru_mainPage(String pageName) {
		
		if(pageName.equalsIgnoreCase("Operations in Stack"))
		{
			driver.findElement(operationInStack_main).click();
		}
		else if(pageName.equalsIgnoreCase("Implementation"))
		{
			driver.findElement(implementation_main).click();
		}
		else if(pageName.equalsIgnoreCase("Applications"))
		{
			driver.findElement(applications_main).click();
		}
		else
			System.out.println("Page cannot be found-stack");
	}
	public void fillCodeEditor(String code) throws InterruptedException
	{
		WebElement textarea = driver.findElement(tryeditor);
		Actions action = new Actions(driver);
		action.sendKeys(textarea, code).build().perform();
		Thread.sleep(1000);

	}
	public void stackHome()
	{
		driver.get(Constants.stackUrl);
	}
	
	public void Page_tryEditor(String pageName)
	{
	
		driver.get(Constants.stackUrl);
		
		if(pageName.equalsIgnoreCase("operation in stack"))
		{
			driver.findElement(operationInStack_main).click();
		}
		else if(pageName.equalsIgnoreCase("Implementation"))
		{
			driver.findElement(implementation_main).click();
		}
		else if(pageName.equalsIgnoreCase("Applications"))
		{
			driver.findElement(applications_main).click();
		}
		else
			System.out.println("Page cannot be found-stack");
		
		driver.findElement(tryherelink).click();

	}
	

}
