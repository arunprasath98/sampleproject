Feature: validating login functionality of fb application
Scenario Outline: validating with valid username and password
Given user is on facebook
When user is going to enter "<username>" and "<password>"
And user should click login button
Then user should verify by seeing home page
Examples: 
|username|password|
|arun    |arun    |
|prasath |prasath |
|puru    |puru    |