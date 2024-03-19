
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page



  Scenario Outline: Verify with different user types
    Given the user logged in with username as "<username>"and password as "<password>"
  Examples:

    | username        | password    |
    | user1           | UserUser123 |
    | salesmanager101 | UserUser123 |
    | storemanager85  | UserUser123 |


#  Scenario:
#    Given the user logged in with username as "User1" and password as "UserUser123"
#    Given the user logged in with username as "storemanager51" and password as "UserUser123"
#    Given the user logged in with username as "salesmanager101" and password as "UserUser123"