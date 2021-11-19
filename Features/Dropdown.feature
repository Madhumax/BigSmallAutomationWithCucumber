Feature: Application Validation

Scenario: Hover Dropdown Validation
Given user chooses the browser
And navigated to the url
When user hovers on the shopBycategory and then shopByPerson dropdown
And click on minion lover option
Then select the product and validate the message "SOLD OUT"
And close the browser
