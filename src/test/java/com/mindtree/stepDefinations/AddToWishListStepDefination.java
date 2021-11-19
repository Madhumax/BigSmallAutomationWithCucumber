package com.mindtree.stepDefinations;



import org.junit.runner.RunWith;
import org.testng.Assert;

import com.mindtree.pageObjects.ProductPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AddToWishListStepDefination extends WebDriverHelper {


    
    @Then("^select the product and add to wishlist accept the access to wishlist msg and validate the message$")
    public void select_the_product_and_add_to_wishlist_accept_the_access_to_wishlist_msg_and_validate_the_message() 
    {
    	ProductPage p=new ProductPage(driver);
		p.getProduct().click();
		p.getWishList().click();
		p.getViewWishList().click();
		p.getAccess().click();
		Assert.assertTrue(p.getValidate().isDisplayed());
    }

  


}