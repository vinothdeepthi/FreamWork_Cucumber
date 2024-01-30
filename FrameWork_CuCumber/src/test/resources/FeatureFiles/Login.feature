Feature: Login Fuctionality

Scenario: Login With Valid Credentials

Given User As Navigate To Login Page
When User Enter Valid User Name "vinothdp13@gmail.com" into the User Name Field
And User Enter Valid Password "vinothbe@23" into the password Field
And User Click On Login button
Then User Should Be Successfully Logged In The Application

Scenario: Login With inValid Credentials

Given User As Navigate To Login Page
When User Enter inValid User Name "vinothmarolix@gmail.com" into the User Name Field
And User Enter inValid Password "12345678" into the password Field
And User Click On Login button
Then User Should Be get The Proper Warning Message About The credentiels Missmatch


Scenario: Login With ValidEmail and Invalid Password 

Given User As Navigate To Login Page
When User Enter Valid User Name "vinothdp13@gmail.com" into the User Name Field
And User Enter inValid Password "123456" into the password Field
And User Click On Login button
Then User Should Be get The Proper Warning Message About The credentiels Missmatch

Scenario: Login With InvalidEmail and valid Password 

Given User As Navigate To Login Page
When User Enter inValid User Name "vinothmarolix@gmail.com" into the User Name Field
And User Enter Valid Password "vinothbe@23" into the password Field
And User Click On Login button
Then User Should Be get The Proper Warning Message About The credentiels Missmatch

Scenario: Login Without Providing Any Credentiels

Given User As Navigate To Login Page
When User Without Enter Valid User Name " " into the User Name Field
And User Without Enter Password " " into the password Field
And User Click On Login button
Then User Should Be get The Proper Warning Message About The credentiels Missmatch




