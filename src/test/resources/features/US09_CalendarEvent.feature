@US09
Feature: Create Calendar Event page function
  User story: As a user, I should see error messages when I enter an invalid integer number into the calendar Repeat Every input box.
Background:
  Given the user is on the login page
  @less
  Scenario Outline: US09AC01TC02 Verify that users see error messages when enter invalid integers (less than 1)

    Given the user logged in with username as "<username>" and password as "<password>"
    When User navigates to Activities
    And User selects the Calendar Events
    And User clicks on the Create Calendar Event button
    And User enables the Repeat checkbox
    And User enters less than one "<incorrect value>" in the Repeat Every input field
    Then User should see the error message "The value have not to be less than 1."
    Examples:
      | username        | password    | incorrect value |
      | user1           | UserUser123 | -5              |
      | salesmanager101 | UserUser123 | -10             |
      | storemanager85  | UserUser123 | 0               |

    @more
  Scenario Outline: US09AC01TC03 Verify that users see error messages when enter invalid integers (more than 99)
    Given the user logged in with username as "<username>" and password as "<password>"
    When User navigates to Activities
    And User selects the Calendar Events
    And User clicks on the Create Calendar Event button
    And User enables the Repeat checkbox
    And User enters more than ninety-nine "<incorrect value>" in the Repeat Every input field
    Then User should see the error message "The value have not to be more than 99."
    Examples:
      | username        | password    | incorrect value |
      | user1           | UserUser123 | 100             |
      | salesmanager101 | UserUser123 | 101             |
      | storemanager85  | UserUser123 | 150             |























