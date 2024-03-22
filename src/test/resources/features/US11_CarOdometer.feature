@US_11
Feature: View Car Odometer Info
  User Story: As a user, I want to view car odometer info on the Vehicles Odometers page.

  Background:
    Given the user is on the login page

    Scenario Outline: Verify that Store and Sales managers see the error message
      Given the user logged in with username as "<username>" and password as "<password>"
      When User hover their mouse over Fleet Tab and clicks on the Vehicle Odometer module
      Then User should see the error message "You do not have permission to perform this action." on the screen
      Examples:
        | username        | password    |
        | salesmanager114 | UserUser123 |
        | storemanager64  | UserUser123 |

    Scenario: Verify that Drivers see the default page as 1.
      Given the user logged in as "driver"
      When User hover their mouse over Fleet Tab and clicks on the Vehicle Odometer module
      Then User should see the default page as 1


    Scenario: Verify that Drivers see the View Per Page as 25 by default
      Given the user logged in as "driver"
      When User hover their mouse over Fleet Tab and clicks on the Vehicle Odometer module
      Then User should see the View Per Page as 25 by default
