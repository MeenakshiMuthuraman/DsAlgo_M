package com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.Constants;

public class ArrayPage {
	
	private WebDriver driver;

	private String appArray = "https://dsportalapp.herokuapp.com/array/applications-of-array/";
	private By appArraylink = By.xpath("//a[@href='applications-of-array']");
	private By codeeditor = By.xpath("//div[@class='input'] ");
	private By answerform = By.id("output");
	
	public ArrayPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public void ArrayHome()
	{
		driver.get(Constants.arrayUrl);
	}
	public void startApplicationofArrayPage() throws InterruptedException
	{
		
		driver.get(appArray);	   
		
	}
	public String getArrayPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public void fillCodeEditor(String code) throws InterruptedException
	{
		WebElement textarea = driver.findElement(codeeditor);
		Actions action = new Actions(driver);
		action.sendKeys(textarea, code).build().perform();
		Thread.sleep(1000);

	}

	public boolean isAnswerDisplayed() throws InterruptedException
	{
		String text =  driver.findElement(answerform).getText();
		Thread.sleep(1000);
		if(text.isBlank())
			return false;
		return true;
	}
	
}
