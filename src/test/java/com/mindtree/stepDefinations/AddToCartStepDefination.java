package com.mindtree.stepDefinations;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.ProductPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.utilities.Screenshot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AddToCartStepDefination extends WebDriverHelper {
	private static Logger log = LogManager.getLogger(AddToCartStepDefination.class.getName());

	@When("^entered the text \"([^\"]*)\" in the textbox and press enter$")
	public void entered_the_text_something_in_the_textbox_and_press_enter(String strArg1) {
		LandingPage lp = new LandingPage(driver);
		lp.getSearchBox().sendKeys(strArg1);
		lp.getSearchBox().sendKeys(Keys.ENTER);
		log.debug("navigated to the " + strArg1 + " page");

	}

	@Then("^validate the text receive updates$")
	public void validate_the_text_receive_updates() {
		ProductPage p = new ProductPage(driver);
		Assert.assertTrue(p.getTextmessage().isDisplayed());
		log.debug("text is validated");
	}

	@And("^select the product and add to cart and then checkout$")
	public void select_the_product_and_add_to_cart_and_then_checkout() throws IOException {
		ProductPage p = new ProductPage(driver);
		p.getProduct().click();
		p.getAddToCart().click();
		log.debug("added to the cart");
		Screenshot s = new Screenshot();
		s.getSS("AddToCart");
		log.debug("screenshot taken");
		p.getCheckout().click();
		log.debug("clicked on checkout");

	}

}