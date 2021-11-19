package com.mindtree.stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.ProductPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class RemoveFromWishListStepValidation extends WebDriverHelper {


    
	@Then("^select the product and add to wishlist accept the access to wishlist msg and validate the message and remove it from wishlist$")
    public void select_the_product_and_add_to_wishlist_accept_the_access_to_wishlist_msg_and_validate_the_message_and_remove_it_from_wishlist() throws Throwable {
		LandingPage lp=new LandingPage(driver);
		lp.getSearchBox().sendKeys("key chains");
		lp.getSearchBox().sendKeys(Keys.ENTER);
		ProductPage p=new ProductPage(driver);
		p.getProduct().click();
		p.getWishList().click();
		p.getViewWishList().click();
		p.getAccess().click();
		Assert.assertTrue(p.getValidate().isDisplayed());
		p.getRemove().click();
		System.out.println("good");
    }

  


}