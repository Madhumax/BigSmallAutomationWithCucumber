package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.LandingPageUI;

public class LandingPage 
{
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSignin()
	{
		return driver.findElement(LandingPageUI.signin);
	}
	public WebElement getSearchBox()
	{
		return driver.findElement(LandingPageUI.searchBox);
	}
	public WebElement getCorporateGifts()
	{
		return driver.findElement(LandingPageUI.corporateGifts);
	}
	public WebElement getPersonalizedGifts()
	{
		return driver.findElement(LandingPageUI.personalizedGifts);
	}
	public int getLinks()
	{
		return driver.findElements(LandingPageUI.links).size();
	}
	public WebElement getChristmasGifts()
	{
		return driver.findElement(LandingPageUI.christmasGifts);
	}
	public WebElement getShopByCategory()
	{
		return driver.findElement(LandingPageUI.shopByCategory);
	}
	public WebElement getShopByPerson()
	{
		return driver.findElement(LandingPageUI.shopByPerson);
	}
	public WebElement getMinion()
	{
		return driver.findElement(LandingPageUI.minion);
	}
	public WebElement getMarvel()
	{
		return driver.findElement(LandingPageUI.marvel);
	}
	
}
