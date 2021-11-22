package com.mindtree.stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.ProductPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.utilities.Screenshot;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class RemoveFromWishListStepValidation extends WebDriverHelper {

	private static Logger log = LogManager.getLogger(RemoveFromWishListStepValidation.class.getName());

	@Then("^select the product and add to wishlist accept the access to wishlist msg and validate the message and remove it from wishlist$")
	public void select_the_product_and_add_to_wishlist_accept_the_access_to_wishlist_msg_and_validate_the_message_and_remove_it_from_wishlist()
			throws Throwable {
		LandingPage lp = new LandingPage(driver);
		lp.getSearchBox().sendKeys("key chains");
		log.debug("entered the keyword into the search box");
		lp.getSearchBox().sendKeys(Keys.ENTER);
		ProductPage p = new ProductPage(driver);
		p.getProduct().click();
		log.debug("clicked on the product");
		p.getWishList().click();
		log.debug("clicked on wishlist icon");
		p.getViewWishList().click();
		p.getAccess().click();
		log.debug("clicked on access to wishlist");
		Assert.assertTrue(p.getValidate().isDisplayed());
		log.debug("product is successfully added to wishlist");
		p.getRemove().click();
		Screenshot s = new Screenshot();
		s.getSS("RemoveFromWishList");
		log.debug("screenshot taken");
		System.out.println("good");
	}

}