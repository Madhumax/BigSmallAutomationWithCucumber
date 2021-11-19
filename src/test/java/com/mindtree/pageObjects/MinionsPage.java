package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.MinionsPageUI;

public class MinionsPage 
{
	public WebDriver driver;
	
	public MinionsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getMinionProduct()
	{
		return driver.findElement(MinionsPageUI.minionProduct);
	}
	public WebElement getSoldOut()
	{
		return driver.findElement(MinionsPageUI.soldout);
	}
	
	
}
