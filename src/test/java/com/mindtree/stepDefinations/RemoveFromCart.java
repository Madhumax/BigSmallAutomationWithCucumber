package com.mindtree.stepDefinations;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import com.mindtree.pageObjects.ChristmasGiftsPage;
import com.mindtree.pageObjects.LandingPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.utilities.Screenshot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class RemoveFromCart extends WebDriverHelper
{

	private static Logger log=LogManager.getLogger(RemoveFromCart.class.getName());
    @When("^user clicks on christmas gifts icon$")
    public void user_clicks_on_christmas_gifts_icon() 
    {
    	LandingPage lp=new LandingPage(driver);
		lp.getChristmasGifts().click();
		log.debug("clicked on christmas gifts icon");
    }

    @Then("^selects the product$")
    public void selects_the_product() 
    {
    	ChristmasGiftsPage cp=new ChristmasGiftsPage(driver);
		cp.getProduct().click();
		log.debug("clicked on product");
    }

   

    @And("^adds to cart and then removes it$")
    public void adds_to_cart_and_then_removes_it() throws InterruptedException, IOException 
    {
    	ChristmasGiftsPage cp=new ChristmasGiftsPage(driver);
		cp.getAddToCart().click();
		log.debug("clicked on add to cart");
		Thread.sleep(3000L);
		cp.getRemove().click();
		Screenshot s= new Screenshot();
		s.getSS("RemoveFromCart");
		log.debug("screenshot taken");
    }

   

}