Feature: Application Validation

Scenario: Add To Wishlist Validation

Given user chooses the browser
And navigated to the url
When entered the text "key chains" in the textbox and press enter
Then select the product and add to wishlist accept the access to wishlist msg and validate the message
And close the browser
