@B32G14-201
Feature: Default

	
	@B32G14-199
	Scenario Outline: Verify that Store managers and Sales managers can access the Vehicle Contracts page.
		Given the user logged in as "<userType>"
		When user hover over on Fleet and clicks Vehicle Contracts
		Then user sees "All - Vehicle Contract - Entities - System - Car - Entities - System" title

		Examples:

			|userType|
			|sales manager|
			|store manager|

	
	@B32G14-200
	Scenario: Verify that Drivers can NOT access the Vehicle Contracts page
		Given the user logged in as "driver"
		When user hover over on Fleet and clicks Vehicle Contracts
		Then user sees "You do not have permission to perform this action." message on screen