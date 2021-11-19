package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class PersonalizedGiftsPageUI 
{
	public static By product=By.xpath("//*[contains(text(),'Personalized Name Holographic Stainless Steel Bottl')]");
	public static By addToCart=By.xpath("//*[@id=\'AddToCartForm-6797675299014\']/button");
	public static By name=By.cssSelector("input[placeholder='Nidhi']");
	public static By checkout=By.cssSelector("//*[@id=\'CartPage\']/div/form/div[5]/div/div[2]/div/button");
	
}
