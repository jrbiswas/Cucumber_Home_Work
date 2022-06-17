
@DbLoginFeature @Regression
Feature: Techfios Billing Login Functionality Validation

@DbScenario1 
Scenario: 1 User should be able to Login with valid credentials
Given User is on Techfios login page 
When User enters "username" from Techfios database
When User enters "password" from Techfios database
When User clicks on signin button
Then User should land on dashboard page

