@US06
Feature: User should see edit car info icons from the Vehicle page
  User story: As a user, I want to see edit car info icons from the Vehicles page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify users can see edit car info icons from the Vehicles page
    Given  the user logged in as "<userType>"
    When user hover over on "Fleet" and clicks "Vehicles"
    And hover over on the three dots in the right side of the table
    Then user can see edit car info icons
      | View   |
      | Edit   |
      | Delete |
    Examples:
      | userType      |
      | store manager |
      | sales manager |
      | driver        |