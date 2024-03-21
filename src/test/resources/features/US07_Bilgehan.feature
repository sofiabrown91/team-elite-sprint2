@vehicle
Feature: Vehicle select function
Agile Story:
As a user (Sales and Store manager), I should be able to select any vehicle from the Vehicles page (web table)


Scenario: Verify that once the store manager launch on the Vehicles page, store manager can see all the checkboxes as unchecked.

  Given Store Manager is logged in as "store manager" and "password"
  And user hovers on Fleet dropdown on dashboard and user selects Vehicles
  Then user  sees all boxes unchecked


Scenario: Verify that store manager can check the first checkbox to select all the cars
  Given Store Manager is logged in as "store manager" and "password"
  And user hovers on Fleet dropdown on dashboard and user selects Vehicles
  And user clicks the first check box
  Then all the cars are selected

Scenario: Verify that store manager can select any
  Given Store Manager is logged in as "store manager" and "password"
  And user hovers on Fleet dropdown on dashboard and user selects Vehicles
  And User clicks on 5
  Then clicked car is selected


