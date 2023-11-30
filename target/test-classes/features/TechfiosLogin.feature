
Feature: Techfios login functionality validation

  Background: 
     
   Scenario Outline:  
 
  User should be able to login with the valid credential
  Given User is on the techfios login page
 When User enters the "demo@techfios.com" in the "username" field
When User enters the "<abc123>" in the "password" field

 

  