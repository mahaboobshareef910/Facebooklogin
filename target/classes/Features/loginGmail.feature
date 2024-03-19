Feature: login Functionality
@login
Scenario: login with valid credentials

Given user navigate to Gmail_loginpage
When user clicks on SigninOption
And user enters valid email address "mahaboobshareef787@gmail.com" into email field
And user click on nextbutton 
And user enters valid password "9603205826mabu@" into password field 
And user clicks on nextbutton
Then user LoginAccountpage with GmailLogo

Scenario: login with valid Email and Invalid Password
Given user navigate to Gmail_loginpage
When user clicks on SigninOption
And user enters valid email address "mahaboobshareef787@gmail.com" into email field
And user click on nextbutton 
And  user enters Invalid password "960320586@Dlc" into password field 
And user clicks on nextbutton
Then user get proper Warning Message


