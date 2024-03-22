@vehicle
Feature: Vehicle select function
Agile Story:
As a user (Sales and Store manager), I should be able to select any vehicle from the Vehicles page (web table)



Scenario Outline:Verify that once the store manager or sales manager launch on the Vehicles page, store manager can see all the checkboxes as unchecked.

  Given User is logged in as "<username>" and "<password>"
  And user hovers on Fleet dropdown on dashboard and user selects Vehicles
  Then user  sees all boxes unchecked

Examples:
  | username        | password    |
  | salesmanager101 | UserUser123 |
  | storemanager85  | UserUser123 |


Scenario Outline:Verify that store manager or sales manager can check the first checkbox to select all the cars
  Given User is logged in as "<username>" and "<password>"
  And user hovers on Fleet dropdown on dashboard and user selects Vehicles
  And user clicks the first check box
  Then all the cars are selected

  Examples:
    | username        | password    |
    | salesmanager101 | UserUser123 |
    | storemanager85  | UserUser123 |

Scenario Outline: Verify that store manager or sales manager can select any
  Given User is logged in as "<username>" and "<password>"
  And user hovers on Fleet dropdown on dashboard and user selects Vehicles
  And User clicks on 5
  Then clicked car is selected

  Examples:
    | username        | password    |
    | salesmanager101 | UserUser123 |
    | storemanager85  | UserUser123 |
