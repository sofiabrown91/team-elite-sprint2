@US_14
Feature: User should be able to manage filters on the Marketing page

   As a user, I want to manage filters on the Marketing page.

  Background: User is already in the log in page
    Given the user is on the login page



  @US14_1_SLM
  Scenario: Verify that once the sales manager launch on the Campaigns page under Marketing.
    Given the user logged in as "sales manager"
    Given the user in on the campaign page
    When user sees Manage filters button
    Then user verifies 5 options are checked by default

  @US14_1_STM
  Scenario: Verify that once the store manager launch on the Campaigns page under Marketing.
    Given the user logged in as "store manager"
    Given the user in on the campaign page
    When user sees Manage filters button
    Then user verifies 5 options are checked by default

  @US14_2_SLM
  Scenario: Verify that once the sales manager launch on the Campaigns page under Marketing.
    Given the user logged in as "sales manager"
    Given the user in on the campaign page
    When user sees Manage filters button
    And user uncheck one or more options
    Then user verifies one or more options are unchecked


  @US14_2_STM
  Scenario: Verify that once the sales manager launch on the Campaigns page under Marketing.
    Given the user logged in as "store manager"
    Given the user in on the campaign page
    When user sees Manage filters button
    And user uncheck one or more options
    Then user verifies one or more options are unchecked




