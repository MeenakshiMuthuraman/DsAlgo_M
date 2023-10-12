package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class QueuePage {
	
	private WebDriver driver;
	
	private By implementationLists = By.xpath("//a[@href='implementation-lists']");
	private By implementationCollections = By.xpath("//a[@href='implementation-collections']");
	private By implementationArray = By.linkText("Implementation using array");
	private By queueOp = By.linkText("Queue Operations");


	public QueuePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void navigatethru_QueuePage(String pageName) {
		
		if(pageName.equalsIgnoreCase("Implementation of Queue in Python"))
		{
			driver.findElement(implementationLists).click();
		}
		else if(pageName.equalsIgnoreCase("Implementation using collections.deque"))
		{
			driver.findElement(implementationCollections).click();
		}
		else if(pageName.equalsIgnoreCase("Implementation using array"))
		{
			driver.findElement(implementationArray).click();
		}
		else if(pageName.equalsIgnoreCase("Queue Operations"))
		{
			driver.findElement(queueOp).click();
		}
		else
			System.out.println("Page cannot be found-queue");
	}

}
