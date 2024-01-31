Feature: Search Product Fuctionality

@Smoke
Scenario: User Able To Search The Valid Product

Given User navigate To The dashBoad Page
When User Entering The Valid Product "iphone" InTo The SearchText Field
And User Click On The Search button
Then User Should be View given The Products into The Product List Page 

Scenario: User Able To Search The inValid Product

Given User navigate To The dashBoad Page
When User Entering The inValid Product "ihss" InTo The SearchText Field
And User Click On The Search button
Then User Should be Get The Proper Error Message

Scenario: User Notable to Entering The Product

Given User navigate To The dashBoad Page
When User Without Entering Any Product InTo The SearchText Field
And User Click On The Search button
Then User Should be Get The Proper Error Message






