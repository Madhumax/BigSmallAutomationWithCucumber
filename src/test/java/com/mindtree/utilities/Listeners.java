package com.mindtree.utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Screenshot implements ITestListener
{

	public void onTestSuccess(ITestResult result)
	{
		try {
			getSS(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the name of testcase success is "+result.getName());
	}
	
}
