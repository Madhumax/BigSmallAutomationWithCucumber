Feature: Application Validation

Scenario: Add To Cart Validation
Given user chooses the browser
And navigated to the url
When entered the text "key chains" in the textbox and press enter
And select the product and add to cart and then checkout
Then validate the text receive updates
And close the browser
