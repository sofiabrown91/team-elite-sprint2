@B32G14-208
Feature: Default


	@B32G14-204
	Scenario: US05_AC01_TC01_Verify that the Store manager and Sales manager can see 10 columns on the Vehicles Model page.
		Given Store Manager is logged in as "store manager" and "password"
		  And user hovers on Fleet dropdown on dashboard and user selects Vehicles Model
		  Then user sees the columns as below
		  |MODEL NAME|
		  |MAKE|
		  |CAN BE REQUESTED|
		  |CVVI|
		  |CO2 FEE (/MONTH)|
		  |COST (DEPRECIATED)|
		  |TOTAL COST (DEPRECIATED)|
		  |CO2 EMISSIONS|
		  |FUEL TYPE|
		  |VENDORS|	


	@B32G14-205
	Scenario: US05_AC01_TC02Verify that the Sales manager can see 10 columns on the Vehicles Model page.
		Given Sales Manager is logged in as "sales manager" and "password"
		    And user hovers on Fleet dropdown on dashboard and user selects Vehicles Model
		    Then user sees the columns as below
		      |MODEL NAME|
		      |MAKE|
		      |CAN BE REQUESTED|
		      |CVVI|
		      |CO2 FEE (/MONTH)|
		      |COST (DEPRECIATED)|
		      |TOTAL COST (DEPRECIATED)|
		      |CO2 EMISSIONS|
		      |FUEL TYPE|
		      |VENDORS|	


	@B32G14-206
	Scenario: US05_AC02_TC01_Verify that Drivers cannot access the Vehicles Model page
		Given driver is logged in as "driver" and "password"
		  And user hovers on Fleet dropdown on dashboard and user selects Vehicles Model
		  Then user sees You do not have permission to perform this action.