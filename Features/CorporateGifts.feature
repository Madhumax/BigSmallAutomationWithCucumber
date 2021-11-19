Feature: Application Validation

Scenario Outline: Corporate Gifts Validation


Given user chooses the browser
And navigated to the url
When user clicked on Corporate Gifts icon
And enter the details <name> <email> <phone_number> <enquiry_message>
Then click on submit in corporateGifts page
And close the browser

Examples:
|name				|email					|phone_number			|enquiry_message				|			
|madhu palla|madhu@gmail.com|456321						|quantity-500						|