@US08
Feature: Create Calendar Event page function
  User story: As a user, I want to create a recurring(repetitive) calendar event.
  Background:
    Given the user is on the login page

  Scenario Outline: US08AC01TC04 Verify that users see the number "1" by default in the Repeat Every input option.
    Given the user logged in with username as "<username>" and password as "<password>"
    When user hover over on "Activities" and clicks "Calendar Events"
    And User clicks on the Create Calendar Event button
    And User enables the Repeat checkbox
    Then User should see the number "1" by default in the Repeat Every input option
    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |

  Scenario Outline: US08AC01TC05 Verify that users see the number "1" by default in the Repeat Every input option.
    Given the user logged in with username as "<username>" and password as "<password>"
    When user hover over on "Activities" and clicks "Calendar Events"
    And User clicks on the Create Calendar Event button
    And User enables the Repeat checkbox
    And User clears the Repeat Every field
    Then User should see the error message "This value should not be blank."
    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |
