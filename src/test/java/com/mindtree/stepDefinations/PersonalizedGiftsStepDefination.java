package com.mindtree.stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.PersonalizedGiftsPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class PersonalizedGiftsStepDefination extends WebDriverHelper {


    @When("^user clicked on Personalized Gifts icon$")
    public void user_clicked_on_personalized_gifts_icon()
    {
    	LandingPage l=new LandingPage(driver);
		l.getPersonalizedGifts().click();
		
		
  
    }

    @Then("^clicked on the product and then enter the name as \"([^\"]*)\" and press enter$")
    public void clicked_on_the_product_and_then_enter_the_name_as_something_and_press_enter(String strArg1) throws Throwable {
    	PersonalizedGiftsPage pg=new PersonalizedGiftsPage(driver);
		pg.getProduct().click();
		pg.getName().sendKeys(strArg1);
		pg.getName().sendKeys(Keys.ENTER);
    }

    @And("^click on add to cart in the personalized gifts test$")
    public void click_on_add_to_cart_in_the_personalized_gifts_test() throws Throwable 
    {
    	PersonalizedGiftsPage pg=new PersonalizedGiftsPage(driver);
    	pg.getAddToCart().click();
    }

}