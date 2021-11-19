package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.ChristmasGiftsPageUI;

public class ChristmasGiftsPage 
{
	public WebDriver driver;
	
	public ChristmasGiftsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getProduct()
	{
		return driver.findElement(ChristmasGiftsPageUI.product);
	}
	public WebElement getAddToCart()
	{
		return driver.findElement(ChristmasGiftsPageUI.addTocart);
	}
	public WebElement getRemove()
	{
		return driver.findElement(ChristmasGiftsPageUI.remove);
	} 
	
}
