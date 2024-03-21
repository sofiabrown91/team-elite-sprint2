@US_13
Feature: As a user I want to manage filters on the Vehicle Costs page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that users see 3 columns on the Vehicle Costs page
    Given the user logged in as "<userType>"
    When user hover over on Fleet and clicks Vehicle Costs
    Then user should see columns
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    Examples:
      | userType      |
      | store manager |
      | sales manager |


  Scenario Outline: Verify that users can check the first checkbox to select All Vehicle
    Given the user logged in as "<userType>"
    When user hover over on Fleet and clicks Vehicle Costs
    Then user can click on first checkbox to select All Vehicle Costs
    Examples:
      | userType      |
      | store manager |
      | sales manager |





