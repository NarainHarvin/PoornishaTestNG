Feature: This is the login feature for Orange HRM

Scenario Outline: This is login scenario

Given Proceed to login page
When user enters  "<UserName>" and "<Password>"
And  clicked  button

Examples:
|UserName | Password|
|Admin    | admin123|