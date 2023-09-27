package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Constants;

public class GraphPage {

	private WebDriver driver;
	private By graphlink = By.linkText("Graph");
	private By graphrepresentation = By.linkText("Graph Representations");
	private By tryherelink = By.linkText("Try here>>>");
	
	public GraphPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void navigatethru_graphPage(String pageName) {
		
		if(pageName.equalsIgnoreCase("Graph"))
		{
			driver.findElement(graphlink).click();
		}
		else if(pageName.equalsIgnoreCase("Graph Representations"))
		{
			driver.findElement(graphrepresentation).click();
		}
		else
			System.out.println("Page cannot be found-queue");
	}
	public void Page_tryEditor(String pageName)
	{
	
		driver.get(Constants.graphUrl);
		navigatethru_graphPage(pageName);
		driver.findElement(tryherelink).click();
	}
	public String getInvalidCodeError()
	{
		
		Alert alertWindow = driver.switchTo().alert();
		String alerttext = alertWindow.getText();
		alertWindow.accept();
		return alerttext;
	}
}
