Feature: Verify user can login the web application

Scenario: Verify login with valid credentials
Given Open The Chrome Browser
And user navigate the url "https://practice.expandtesting.com/login"
When enter the username "practice"
When enter the password "SuperSecretPassword!"
And User click on login
Then user can see the logout "page Secure Page page for Automation Testing Practice"