package com.mindtree.stepDefinations;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import com.mindtree.pageObjects.CorporateGiftsPage;
import com.mindtree.pageObjects.LandingPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.utilities.Screenshot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class CorporateGiftsStepDefination extends WebDriverHelper
{

	private static Logger log = LogManager.getLogger(MarvelPageSortByStepDefination.class.getName());

	@When("^user clicked on Corporate Gifts icon$")
	public void user_clicked_on_corporate_gifts_icon() {
		LandingPage l = new LandingPage(driver);
		l.getCorporateGifts().click();
		log.debug("clicked on corporate gifts icon");

	}

	@Then("^click on submit in corporateGifts page$")
	public void click_on_submit_in_corporateGifts_page() {
		CorporateGiftsPage cgp = new CorporateGiftsPage(driver);
		cgp.getSubmit().click();
		log.debug("details were entered successfully");
	}

	@And("^enter the details (.+) (.+) (.+) (.+)$")
	public void enter_the_details(String name, String email, String phonenumber, String enquirymessage)
			throws IOException {
		CorporateGiftsPage cgp = new CorporateGiftsPage(driver);
		cgp.getName().sendKeys(name);
		cgp.getEmail().sendKeys(email);
		cgp.getPhone().sendKeys(phonenumber);
		cgp.getEnquiry().sendKeys(enquirymessage);
		Screenshot s = new Screenshot();
		s.getSS("CorporateGifts");
	}

}