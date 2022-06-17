
@OtherLoginFeature @Regression
Feature: Techfios Other Login Functionality Validation

// By assigning the backgrond key word, the login page url would be displayed for all other Scenarios, no need to write everytime
Background:
 Given User is on Techfios login page 

@OtherScenario1
Scenario Outline: 1 User should be able to Login with valid credentials(Other)
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks on signin button
Then User should land on dashboard page

Examples:
|username|password|
|demo@techfios.com|abc123|
|demo@techfios.com|abc123|


#@OtherScenario2 @Smoke
#Scenario: 2 User should not be able to Login with invalid credentials (Other)
#Given User is on Techfios login page (no need as already been define in background)
#When User enters username as "demo@techfios.com"
#When User enters password as "abc124"
#When User clicks on signin button
#Then User should land on dashboard page

#@OtherScenario3
#Scenario: 1 User should be able to Login with valid credentials(Other)
#Given User is on Techfios login page (no need as already been define in background)
#When User enters username as "demo@techfios.com"
#When User enters password as "abc123"
#When User clicks on signin button
#Then User should land on dashboard page
