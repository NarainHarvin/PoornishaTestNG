
Feature: This is the login feature for Orange HRM

Scenario: This is login scenario

Given user is on the login application
When user enters  the valid credentials 
|Admin|admin123|
And  clicks  the login button
Then the  user  should see  the  homescreen