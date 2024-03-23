@B32G14-193
Feature: User should be able to see all main modules


  @B32G14-188
  Scenario: US01AC02TC01  Verify Menu Options for Driver.
    Given the user logged in as "driver"
    Then user should see the following options

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



  @B32G14-187
  Scenario: US01AC01TC01  Verify Menu Options for Store Manager.
    Given the user logged in as "store manager"
    Then the user should see the following options

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  @B32G14-185
  Scenario: US01AC01TC02  Verify Menu Options for Sales Manager.
    Given the user logged in as "sales manager"
    Then the user should see the following options

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


