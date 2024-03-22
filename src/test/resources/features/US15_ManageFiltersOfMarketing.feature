@US_14
Feature: User should be able to manage filters on the Marketing page

   As a user, I want to manage filters on the Marketing page.

  Background: User is already in the log in page
    Given the user is on the login page



  @US14_1_SLM
  Scenario Outline: Verify that once the users launch on the Campaigns page under Marketing.
    Given the user logged in as "<userType>"
    Given user hover over on "Marketing" and clicks "Campaigns"
    When user sees and clicks Manage filters button
    Then user verifies 5 options are checked by default
    Examples:
      | userType      |
      | store manager |
      | sales manager |





  Scenario Outline: Verify that once the sales manager launch on the Campaigns page under Marketing.
    Given the user logged in as "<userType>"
    Given user hover over on "Marketing" and clicks "Campaigns"
    When user sees and clicks Manage filters button
    And user uncheck 0 2 4 option
    Then user verifies 0 2 4 options are unchecked
    Examples:
      | userType      |
      | store manager |
      | sales manager |







