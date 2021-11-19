package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.MarvelPageUI;

public class MarvelPage 
{
	public WebDriver driver;
	
	public MarvelPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSortBy()
	{
		return driver.findElement(MarvelPageUI.sort);
	}
	public WebElement getValidate()
	{
		return driver.findElement(MarvelPageUI.validate);
	}
	
}
