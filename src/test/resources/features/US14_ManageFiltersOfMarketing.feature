Feature: As a user I want to manage filters on the Marketing module

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that users see 5 columns when filtering on the All Campaigns page
    Given the user logged in as "<userType>"
    When user hover over on Marketing and clicks Campaigns
    Then user should see these options on columns
      | Name       |
      | Code       |
      | Start Date |
      | End Date   |
      | Budget     |
    Examples:
      | userType      |
      | store manager |
      | sales manager |


  Scenario Outline: Verify that users can unchecked any amount of boxes
    Given the user logged in as "<userType>"
    When user hover over on Marketing and clicks on Campaigns button
    Then user hover over on Manage filters dropdown and clicks on it
    Then user can click on any amount of boxes and can uncheck.(Can check only 1 or multiple)
    Examples:
      | userType      |
      | store manager |
      | sales manager |












