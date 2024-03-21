@US10
Feature: Create Calendar Event page function
  User story: As a user, I want to type into the Description field when I create a calendar event. (Iframe)

  Background:
    Given the user is on the login page

  Scenario Outline: US10AC01TC01 Verify that users can type messages into the Description field on the Calendar Events page
    Given the user logged in with username as "<username>" and password as "<password>"
    When user hover over on "Activities" and clicks "Calendar Events"
    And User clicks on the Create Calendar Event button
    And User types "Daily standup meeting sets up every weekday." into the Description input box
    Then User should be able to type into the Description input box and see typed "Daily standup meeting sets up every weekday." text
    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |
