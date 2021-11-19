package com.mindtree.stepDefinations;

import org.junit.runner.RunWith;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class CountingLinksInTheHomePage extends WebDriverHelper {



    @Then("^count the links in the home page$")
    public void count_the_links_in_the_home_page()
    {
    	LandingPage lp=new LandingPage(driver);
		System.out.println("Total links in the landing page "+lp.getLinks());
    }

}