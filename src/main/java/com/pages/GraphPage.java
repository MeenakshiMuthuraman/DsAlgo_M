package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GraphPage {

	private WebDriver driver;
	private By graphlink = By.linkText("Graph");
	private By graphrepresentation = By.linkText("Graph Representations");
	
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
			System.out.println("Page cannot be found-Graph");
	}
}
