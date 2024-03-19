@US_02
Feature: Access the Oroinc documentation page from base page

  Background:
		#@B32G14-186
    Given user is on the login page

	#As a user, I should access to the Oroinc Documentation page. (Window
	#handle)
	#Verify that users access to the Oroinc Documentation page by clicking the
	#question mark icon. The page’s URL is: https://doc.oroinc.com/
	#//Try with truck driver, store manager, and sales manager credentials to make sure all three work properly
  Scenario Outline: US02AC01TC01 - Verify that users access to the Oroinc Documentation page by clicking the question mark icon
    Given the user logged in with username as "<username>" and password as "<password>"
    When User navigates to question mark button and clicks on it
    Then User should see the oroinc documentation page open in a new tab
    Examples:
      | username        | password    |
      | user50          | UserUser123 |
      | salesmanager100 | UserUser123 |
      | storemanager150 | UserUser123 |