@LoginFeature
Feature: Techfios login functionality validation

  Background: 
    Given User is on codefios login page
    
  @Scenario1 @Smoke
  Scenario: User should be able to login with the valid credential
  When User enters "username" from mysql as database 
    When User enters "password" from mysql as database 
    When User clicks on signin button
    Then User should land on dashbord page
    
 

  @Scenario2
  Scenario: User should be able to login with the valid credential
  When User enters username as "demo1@techfios.com"
    When User enters password as "abc124"
    When User clicks on signin button
    Then User should land on dashbord page
