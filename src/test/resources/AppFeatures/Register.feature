Feature: User Registration

Scenario: User Restration with different data

	Given User is on Registration Page
	When User enters following user details
			| Numpysdet84|"sdet84batch"|sdet84batch|
	And User clicks on register button
	Then User should get error message
	
	