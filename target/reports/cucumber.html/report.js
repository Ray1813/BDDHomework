$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TechfiosHomework1.feature");
formatter.feature({
  "name": "Techfios Other billing login page functionality validation",
  "description": "    Given User is on the techfios login page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ramon"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "    and open a new account",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" in the \"username\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the \"\u003cpassword\u003e\" in the \"password\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on \"bankCash\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountTitle\u003e\" in the \"accountTitle\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cPhone\u003e\" in the \"Phone\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in the \"internetBankingURL\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"submit\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "Phone",
        "internetBankingURL"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "New Chequing",
        "Ramon new account",
        "$50,000",
        "1234567",
        "James Bond",
        "4032223344",
        "https://www.techfios.com/portal/login"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "    and open a new account",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ramon"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"demo@techfios.com\" in the \"username\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_the_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"abc123\" in the \"password\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_the_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"bankCash\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"New Chequing\" in the \"accountTitle\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Ramon new account\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"$50,000\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"1234567\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"James Bond\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"4032223344\" in the \"Phone\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"https://www.techfios.com/portal/login\" in the \"internetBankingURL\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"submit\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});