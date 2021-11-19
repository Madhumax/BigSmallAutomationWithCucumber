package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.CorporateGiftsPageUI;
import com.mindtree.uiStore.LandingPageUI;

public class CorporateGiftsPage 
{
	public WebDriver driver;
	
	public CorporateGiftsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getName()
	{
		return driver.findElement(CorporateGiftsPageUI.name);
	}
	public WebElement getPhone()
	{
		return driver.findElement(CorporateGiftsPageUI.phone);
	}
	public WebElement getEmail()
	{
		return driver.findElement(CorporateGiftsPageUI.email);
	}
	public WebElement getEnquiry()
	{
		return driver.findElement(CorporateGiftsPageUI.enquiry);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(CorporateGiftsPageUI.submit);
	}
	
}
