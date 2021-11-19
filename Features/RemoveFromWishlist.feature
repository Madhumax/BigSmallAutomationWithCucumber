Feature: Application Validation

Scenario: Remove From Wishlist Validation

Given user chooses the browser
And navigated to the url
When entered the text "key chains" in the textbox and press enter
Then select the product and add to wishlist accept the access to wishlist msg and validate the message and remove it from wishlist
And close the browser
