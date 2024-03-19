Feature: As a user I want to manage filters on the Vehicle Costs page

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Verify that users see 3 columns on the Vehicle Costs page
    Given the user logged in as "sales manager"
    |sales manager|
    |store manager|
    When user hover over on Customers and clicks Accounts
    Then user should see filter names in filters section
      |Account Name|
      |Contact Name|
      |Contact Email|
      |Contact Phone|
      |Owner|
      |Business Unit|
      |Created At|
      |Updated At|

