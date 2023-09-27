package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.*;

public class TreePage {
	
private WebDriver driver;
	
	private By treeOverviewLink = By.xpath("//a[text()='Overview of Trees']");
	private By treeOverViewTitle  = By.xpath("//p[@class = 'bg-secondary text-white']");
//	private By treeOverViewTitle = By.tagName("title");
	
	public TreePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void navigateToTreePage() 
	{
		driver.get(Constants.treeUrl);
	}

	public String getTreePageTitle()
	{
		return driver.getTitle();
	}
	
	public void overviewTreeLink()
	{
		driver.findElement(treeOverviewLink).click();
	}
	
	public String getTitleTreePage() throws InterruptedException {
		String title = driver.findElement(treeOverViewTitle).getText();
		return title;
	}
	
}
