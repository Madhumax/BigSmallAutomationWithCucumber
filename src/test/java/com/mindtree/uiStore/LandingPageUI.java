package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class LandingPageUI 
{
	public static By signin=By.className("link_text");
	public static By searchBox=By.className("snize-input-style");
	public static By corporateGifts=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[1]/a");
	public static By personalizedGifts=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[2]/a");
	public static By links=By.tagName("a");
	public static By christmasGifts=By.cssSelector("a[data-dropdown-rel='christmas-gifts']");
	public static By shopByCategory=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[9]/a");
	public static By shopByPerson=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[9]/ul/li[1]/a");
	public static By minion=By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[9]/ul/li[1]/ul/li[3]/a");
	//*[@id="myheader"]/div[1]/div/div/ul/li[9]/ul/li[1]/ul/li[3]/a
	public static By marvel=By.xpath("//img[@data-aspectratio='2.54']");
}
