@B32G14-219
Feature: Default

	@B32G14-217
	Scenario Outline: US03AC01TC01 User can learn how to use pinbar by clicking link
		Given the user logged in as "<userType>"
		  When user clicks on pinbarLink
		  Then user will see pinbar instructions header "How To Use Pinbar"
		  And user will see pinbar instructions text as expected
		  
		  Examples:
		    | userType      |
		    | driver        |
		    | sales manager |
		    | store manager |	

	@B32G14-218
	Scenario Outline: US03AC02TC01 User can see pinbar example image
		Given the user logged in as "<userType>"
		  When user clicks on pinbarLink
		  Then user will see example image
		
		  Examples:
		    | userType      |
		    | driver        |
		    | sales manager |
		    | store manager |