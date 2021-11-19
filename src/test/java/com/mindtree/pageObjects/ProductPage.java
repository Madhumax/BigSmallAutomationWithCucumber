package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uiStore.ProductPageUI;

public class ProductPage 
{
	public WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getProduct()
	{
		return driver.findElement(ProductPageUI.product);
	}
	public WebElement getAddToCart()
	{
		return driver.findElement(ProductPageUI.addToCart);
	}
	public WebElement getTextmessage()
	{
		return driver.findElement(ProductPageUI.textmsg);
	}
	public WebElement getCheckout()
	{
		return driver.findElement(ProductPageUI.checkout);
	}
	public WebElement getWishList()
	{
		return driver.findElement(ProductPageUI.wishlist);
	}
	public WebElement getViewWishList()
	{
		return driver.findElement(ProductPageUI.viewWishlist);
	}
	public WebElement getValidate()
	{
		return driver.findElement(ProductPageUI.validate);
	}
	public WebElement getAccess()
	{
		return driver.findElement(ProductPageUI.access);
	}
	public WebElement getRemove()
	{
		return driver.findElement(ProductPageUI.remove);
	}
	
	
}
