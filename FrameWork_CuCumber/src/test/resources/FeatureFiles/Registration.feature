Feature: Registration Fuctionality

Scenario: User Create An Account With Only Manditory Field
Given User Naviage To The Registration Registration Page
When User Entring The Details With Below The Field
| FirstName | priyanka   |
| LastName  | c          |
|phone      | 8489889583 |
|Password   | vinothbe236 |
|confirmPassword | vinothbe236 |
|Email      | sam8909@gmail.com |
And User Select Privacy and Policy
And User Click On Contine button
Then User Account Should Be Create Succssfully

Scenario: User Create An Account Without Entring All Fields
Given User Naviage To The Registration Registration Page
When User Without Entring The Details With Below The Field
| FirstName         |   divyas    |
| Password          | 12345678        |
| Confirm Password  | 12345678       |
And  User Slelect The New Setteler Subcription 
And User Select Privacy and Policy
And User Click On Contine button
Then User Should Not Be Create An Account and User Should Be View Proper Warning Message

Scenario: User Create An Account Without Select The Privacy and Policy Checkbox
Given User Naviage To The Registration Registration Page
When User Entring The Details With Below The Field
| FirstName | lokeshs   |
| LastName  | v       |
|phone      | 8489889509 |
|Password   | vinothbe676 |
|confirmPassword | vinothbe676 |
|Email      | lokesh2@gmail.com |
And User Without Select Privacy and Policy CheckBox
And User Click On Contine button
Then User Should Be Get The Proper Warning Message






