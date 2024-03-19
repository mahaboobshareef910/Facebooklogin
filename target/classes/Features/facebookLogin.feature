Feature: login Functinality

Scenario: Login in With Valid credetials

Given user naviate to Facebook home page
When user enter facebookmailId into "mahaboobshareef543" emailField
And user enter Password into "9603205826mabu@" PasswordField
And user clicksOn Login button
Then user successfully loginWith FaceBook_Logo
