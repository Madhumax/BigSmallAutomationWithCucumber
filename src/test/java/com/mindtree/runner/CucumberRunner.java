package com.mindtree.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
	features=".\\Features\\signin.feature",
	glue= {"com.mindtree.stepDefinations"},
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	publish=true
)
public class CucumberRunner 
{

	
}
