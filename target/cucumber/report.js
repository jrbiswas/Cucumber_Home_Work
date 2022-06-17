$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLoginUseDataFromDatabase.feature");
formatter.feature({
  "line": 3,
  "name": "Techfios Billing Login Functionality Validation",
  "description": "",
  "id": "techfios-billing-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@DbLoginFeature"
    },
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 6016703600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "1 User should be able to Login with valid credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;1-user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@DbScenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters \"username\" from Techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"password\" from Techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "TechfiosStepDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 2365888700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "TechfiosStepDefinition.user_enters_from_Techfios_database(String)"
});
formatter.result({
  "duration": 3729103600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "TechfiosStepDefinition.user_enters_from_Techfios_database(String)"
});
formatter.result({
  "duration": 3343112200,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 5723789100,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 10117800,
  "status": "passed"
});
formatter.after({
  "duration": 2391588600,
  "status": "passed"
});
});