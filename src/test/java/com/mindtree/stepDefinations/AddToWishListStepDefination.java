package com.mindtree.stepDefinations;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.testng.Assert;

import com.mindtree.pageObjects.ProductPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.utilities.Screenshot;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AddToWishListStepDefination extends WebDriverHelper {

	private static Logger log=LogManager.getLogger(AddToWishListStepDefination.class.getName());
    
    @Then("^select the product and add to wishlist accept the access to wishlist msg and validate the message$")
    public void select_the_product_and_add_to_wishlist_accept_the_access_to_wishlist_msg_and_validate_the_message() throws IOException 
    {
    	ProductPage p=new ProductPage(driver);
		p.getProduct().click();
		log.info("clicked on product");
		p.getWishList().click();
		Screenshot s= new Screenshot();
		s.getSS("AddToWishList");
		p.getViewWishList().click();
		p.getAccess().click();
		Assert.assertTrue(p.getValidate().isDisplayed());
		log.info("validated");
    }

  


}