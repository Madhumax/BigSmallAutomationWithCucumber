package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class CorporateGiftsPageUI 
{
	public static By name=By.id("contactFormName");
	public static By email=By.id("contactFormEmail");
	public static By phone=By.cssSelector("input[type='tel']");
	public static By enquiry=By.id("contactFormMessage");
	public static By submit=By.cssSelector("input[type='submit']");
}
