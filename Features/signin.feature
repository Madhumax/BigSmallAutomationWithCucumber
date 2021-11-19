Feature: Application Validation

Scenario Outline: signin Validation
Given user chooses the browser
And navigated to the url
When clicked on signin
Then enter the email as "madhu@gmail.com" and password as "madhu" and click on submit
And close the browser
