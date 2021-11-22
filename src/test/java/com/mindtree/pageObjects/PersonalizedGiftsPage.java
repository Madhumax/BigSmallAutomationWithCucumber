package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.PersonalizedGiftsPageUI;

public class PersonalizedGiftsPage 
{
	public WebDriver driver;
	
	public PersonalizedGiftsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getProduct()
	{
		return driver.findElement(PersonalizedGiftsPageUI.product);
	}
	public WebElement getAddToCart()
	{
		return driver.findElement(PersonalizedGiftsPageUI.addToCart);
	}
	public WebElement getName()
	{
		return driver.findElement(PersonalizedGiftsPageUI.name);
	}
	public WebElement getCheckout()
	{
		return driver.findElement(PersonalizedGiftsPageUI.checkout);
	}
	
	
	
}
