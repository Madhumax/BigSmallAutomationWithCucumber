package com.mindtree.stepDefinations;


import org.junit.runner.RunWith;

import com.mindtree.pageObjects.ChristmasGiftsPage;
import com.mindtree.pageObjects.LandingPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class RemoveFromCart extends WebDriverHelper
{


    @When("^user clicks on christmas gifts icon$")
    public void user_clicks_on_christmas_gifts_icon() 
    {
    	LandingPage lp=new LandingPage(driver);
		lp.getChristmasGifts().click();
		
    }

    @Then("^selects the product$")
    public void selects_the_product() 
    {
    	ChristmasGiftsPage cp=new ChristmasGiftsPage(driver);
		cp.getProduct().click();
    }

   

    @And("^adds to cart and then removes it$")
    public void adds_to_cart_and_then_removes_it() throws InterruptedException 
    {
    	ChristmasGiftsPage cp=new ChristmasGiftsPage(driver);
		cp.getAddToCart().click();
		Thread.sleep(3000L);
		cp.getRemove().click();
    }

   

}