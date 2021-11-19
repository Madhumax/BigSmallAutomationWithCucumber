package com.mindtree.stepDefinations;

import org.junit.runner.RunWith;

import com.mindtree.pageObjects.CorporateGiftsPage;
import com.mindtree.pageObjects.LandingPage;
import com.mindtree.reusableComponents.WebDriverHelper;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class CorporateGiftsStepDefination extends WebDriverHelper{

    

    @When("^user clicked on Corporate Gifts icon$")
    public void user_clicked_on_corporate_gifts_icon()
    {
    	LandingPage l=new LandingPage(driver);
		l.getCorporateGifts().click();
	
    }

    @Then("^click on submit in corporateGifts page$")
    public void click_on_submit_in_corporateGifts_page()
    {
    	CorporateGiftsPage cgp=new CorporateGiftsPage(driver);
    	cgp.getSubmit().click();
    }


    @And("^enter the details (.+) (.+) (.+) (.+)$")
    public void enter_the_details(String name, String email, String phonenumber, String enquirymessage) 
    {
    	CorporateGiftsPage cgp=new CorporateGiftsPage(driver);
		cgp.getName().sendKeys(name);
		cgp.getEmail().sendKeys(email);
		cgp.getPhone().sendKeys(phonenumber);
		cgp.getEnquiry().sendKeys(enquirymessage);
    }

    

}