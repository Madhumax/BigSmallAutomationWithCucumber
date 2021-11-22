package com.mindtree.stepDefinations;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.MarvelPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.utilities.Screenshot;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MarvelPageSortByStepDefination extends WebDriverHelper {
	private static Logger log = LogManager.getLogger(MarvelPageSortByStepDefination.class.getName());

	@When("^user scroll down through the home page and clicks on marvel icon$")
	public void user_scroll_down_through_the_home_page_and_clicks_on_marvel_icon() {
		LandingPage l = new LandingPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)", "");
		l.getMarvel().click();
		log.info("clicked on marvel logo and  navigated to marvel page");

	}

	@Then("^in Marvel page click on sort by dropdown and select Name_AZ and validate the text$")
	public void in_marvel_page_click_on_sort_by_dropdown_and_select_nameaz_and_validate_the_text() throws IOException {
		MarvelPage m = new MarvelPage(driver);
		m.getSortBy().click();
		Screenshot s = new Screenshot();
		s.getSS("MarvelPage");
		System.out.println("dropdown clicked");
		for (int i = 0; i < 3; i++) {
			m.getSortBy().sendKeys(Keys.ARROW_DOWN);

		}
		m.getSortBy().sendKeys(Keys.ENTER);
		Assert.assertTrue(m.getValidate().isDisplayed());
		System.out.println("good");

	}

}