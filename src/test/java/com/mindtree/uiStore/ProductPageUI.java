package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class ProductPageUI 
{
	public static By product=By.xpath("//*[contains(text(),'Plush Stress Toy')]");
	public static By addToCart=By.xpath("//*[@id=\'AddToCartForm-6145419509958\']/button/span");
	public static By textmsg=By.xpath("//*[contains(text(),'Receive updates')]");
	public static By checkout=By.xpath("//*[@id=\'CartDrawer\']/form/div[2]/div[3]/button/span");
	
	public static By wishlist=By.xpath("//*[contains(text(),'Add to Wish')]");
	public static By viewWishlist=By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[2]/span");
	public static By validate= By.className("swym-link");
	
	public static By access=By.id("swym-welcome-button");
	public static By remove=By.className("swym-remove");

}
