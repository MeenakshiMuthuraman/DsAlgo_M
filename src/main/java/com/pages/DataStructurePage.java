package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class DataStructurePage {

	
	private WebDriver driver;
	
	private By dataStructureGetStarted = By.xpath("//a[@href ='data-structures-introduction']");
	private By timeComplexityMainPage = By.linkText("Time Complexity");
	private By practicQuestions = By.linkText("Practice Questions");
	
	public DataStructurePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void getStartedDataStructurePage() {	
		driver.findElement(dataStructureGetStarted).click();		
	}
	
	public String getDataStructureTitle() {
		return driver.getTitle();
	}
	public void clickTimeComplexityLink(){
		driver.findElement(timeComplexityMainPage).click();
	}
	public void clickPracticeQuestions() {
		driver.findElement(practicQuestions).click();
	}
	
}
