package com.mindtree.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class CountingLinksInTheHomePage extends WebDriverHelper {
	
	private static Logger log = LogManager.getLogger(CountingLinksInTheHomePage.class.getName());
    @Then("^count the links in the home page$")
    public void count_the_links_in_the_home_page()
    {
    	LandingPage lp=new LandingPage(driver);
    	log.info("Total links in the landing page "+lp.getLinks());
		System.out.println("Total links in the landing page "+lp.getLinks());
    }

}