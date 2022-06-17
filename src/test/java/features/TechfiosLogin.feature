
@LoginFeature @Regression
Feature: Techfios Billing Login Functionality Validation

@Scenario1 
Scenario: 1 User should be able to Login with valid credentials
Given User is on Techfios login page 
When User enters password as "abc123"
When User enters username as "demo@techfios.com"
When User clicks on signin button
Then User should land on dashboard page

@Scenario2
Scenario: 2 User should not be able to Login with invalid credentials
Given User is on Techfios login page 
When User enters username as "username"
When User enters password as "password"
When User clicks on signin button
Then User should land on dashboard page