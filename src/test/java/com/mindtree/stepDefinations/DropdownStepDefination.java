package com.mindtree.stepDefinations;


import org.junit.runner.RunWith;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.MinionsPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class DropdownStepDefination extends WebDriverHelper 
{

    @When("^user hovers on the shopBycategory and then shopByPerson dropdown$")
    public void user_hovers_on_the_shopbycategory_and_then_shopbyperson_dropdown() throws Throwable {
    	LandingPage l=new LandingPage(driver);
    	driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(l.getShopByCategory()).perform();
		action.moveToElement(l.getShopByPerson()).perform();
		
		
		
		
    }

  
    @Then("^select the product and validate the message \"([^\"]*)\"$")
    public void select_the_product_and_validate_the_message_something(String strArg1) throws Throwable {
    	MinionsPage mp=new MinionsPage(driver);
		mp.getMinionProduct().click();
		System.out.println("good");
		String result=mp.getSoldOut().getText();
		Assert.assertEquals(result,strArg1);
    }

    @And("^click on minion lover option$")
    public void click_on_minion_lover_option() throws Throwable {
    	LandingPage l=new LandingPage(driver);
    	l.getMinion().click();
    }

   

}