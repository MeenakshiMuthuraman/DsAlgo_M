package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.util.*;


public class TreePage {
	
private WebDriver driver;
	
	private By treeOverviewLink = By.xpath("//a[text()='Overview of Trees']");
	private By tryherelink = By.linkText("Try here>>>");
	private By clickTerminologies = By.xpath("//a[@href='terminologies']");
	private By typeOfTrees = By.xpath("//a[@href='types-of-trees']");
	private By treeTraversal = By.xpath("//a[text()='Tree Traversals']");
	private By traversalIllustartions = By.xpath("//a[text()='Traversals-Illustration']");
	private By binaryTree =  By.xpath("//a[text()='Binary Trees']");
	private By binaryTreeTypes =  By.xpath("//a[text()='Types of Binary Trees']");
	private By pythonImplement = By.xpath("//a[text()='Implementation in Python']");
	private By binaryTreeTraversal = By.xpath("//a[text()='Binary Tree Traversals']");
	private By binaryTreeImplementation =  By.xpath("//a[text()='Implementation of Binary Trees']");
	private By binaryTreeApplication = By.xpath("//a[text()='Applications of Binary trees']");
	private By binarySearchTree = By.xpath("//a[text()='Binary Search Trees']");
	private By BSTImplementation = By.xpath("//a[text()='Implementation Of BST']");
	private By practiceQuestions = By.xpath("//a[@href='/tree/practice']");
	
	public TreePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void navigateFromTreePage(String pageName) {
		
		if(pageName.equalsIgnoreCase("Overview of Trees"))
		{
			driver.findElement(treeOverviewLink).click();
		}
		else if(pageName.equalsIgnoreCase("Terminologies"))
		{
			driver.findElement(clickTerminologies).click();
		}
		else if(pageName.equalsIgnoreCase("Types of Trees"))
		{
			driver.findElement(typeOfTrees).click();
		}
		else if(pageName.equalsIgnoreCase("Tree Traversals"))
		{
			driver.findElement(treeTraversal).click();
		}
		else if(pageName.equalsIgnoreCase("Traversals-Illustration"))
		{
			driver.findElement(traversalIllustartions).click();
		}
		else if(pageName.equalsIgnoreCase("Binary Trees"))
		{
			driver.findElement(binaryTree).click();
		}
		else if(pageName.equalsIgnoreCase("Types of Binary Trees"))
		{
			driver.findElement(binaryTreeTypes).click();
		}
		else if(pageName.equalsIgnoreCase("Implementation in Python"))
		{
			driver.findElement(pythonImplement).click();
		}
		else if(pageName.equalsIgnoreCase("Binary Tree Traversals"))
		{
			driver.findElement(binaryTreeTraversal).click();
		}
		else if(pageName.equalsIgnoreCase("Implementation of Binary Trees"))
		{
			driver.findElement(binaryTreeImplementation).click();
		}
		else if(pageName.equalsIgnoreCase("Applications of Binary trees"))
		{
			driver.findElement(binaryTreeApplication).click();
		}
		else if(pageName.equalsIgnoreCase("Binary Search Trees"))
		{
			driver.findElement(binarySearchTree).click();
		}
		else if(pageName.equalsIgnoreCase("Implementation Of BST"))
		{
			driver.findElement(BSTImplementation).click();
		}
		else
			System.out.println("Page cannot be found");
	}
	
	
	public void opentryEditor(String pageName)
	{
		driver.get(Constants.treeUrl);
		
		if(pageName.equalsIgnoreCase("Overview of Trees"))
		{
			driver.findElement(treeOverviewLink).click();
		}
		
		driver.findElement(tryherelink).click();
	}

	public void navigateToTreePage() 
	{
		driver.get(Constants.treeUrl);
	}
	
	public void navigateToBstPage() 
	{
		driver.get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
	}
	
	public String getCurrentPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void clickPracticeQuestions() 
	{
		driver.findElement(practiceQuestions).click();
	}
	
}
