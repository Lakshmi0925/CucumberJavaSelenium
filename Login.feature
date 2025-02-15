Feature: Verify user can login the web application

Scenario: Verify login with valid credentials
Given Open The Chrome Browser
And user navigate to fb.com
When enter the username 
And enter the password
And User click on login
Then user can see the logout page