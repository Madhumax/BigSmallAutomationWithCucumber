package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.WebDriverHelper;

public class Screenshot
{
	public static WebDriver driver;
	public static void getSS(String result) throws IOException
	{
		driver=WebDriverHelper.getDriver();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(".\\Screenshots\\"+result+".jpg"));
	}
}
