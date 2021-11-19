package com.mindtree.stepDefinations;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.SignInPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class signinStepDefination extends WebDriverHelper {

    @Given("^user chooses the browser$")
    public void user_chooses_the_browser() throws IOException
    {
    	driver=baseFile();
		
    }

    @When("^clicked on signin$")
    public void clicked_on_signin()
    {
    	LandingPage lp=new LandingPage(driver);
		lp.getSignin().click();
		
    }

    @Then("^enter the email as \"([^\"]*)\" and password as \"([^\"]*)\" and click on submit$")
    public void enter_the_email_as_something_and_password_as_something_and_click_on_submit(String strArg1, String strArg2)
    {
    	SignInPage sp=new SignInPage(driver);
		sp.getEmail().sendKeys(strArg1);
		sp.getPassword().sendKeys(strArg2);
		sp.getSubmit().click();

    }

    @And("^navigated to the url$")
    public void navigated_to_the_url()
    {
    	driver.get(prop.getProperty("url"));
    }
    @And("^close the browser$")
    public void close_the_browser() 
    {
        driver.close();
    }

}