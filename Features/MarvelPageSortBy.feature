Feature: Application Validation

Scenario: Marvel Page Validation
Given user chooses the browser
And navigated to the url
When user scroll down through the home page and clicks on marvel icon
Then in Marvel page click on sort by dropdown and select Name_AZ and validate the text
And close the browser
