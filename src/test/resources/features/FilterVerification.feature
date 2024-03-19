@B32G14-196
Feature: Default

	Background: User is already in the log in page
		Given the user is on the login page

	@B32G14-194
	Scenario: Verify that users see 8 filter items on the Accounts page
		Given the user logged in as "sales manager"
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

	
	@B32G14-195
	Scenario: Verify that users see 8 filter items on the Accounts page
		Given the user logged in as "store manager"
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