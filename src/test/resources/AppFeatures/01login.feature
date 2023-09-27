Feature: Login page feature
  Registered user should be able to login

  Scenario: Login page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Login"

  Scenario: New User Register link
    Given user is on login page
    Then Register link should be displayed

 Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "Numpysdet84"
    And user enters password "sdet84batch"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "NumpyNinja"
 
#Scenario: Login with invalid credentials
#		Given user is on login page
#		When user enters username 
#		And user enters password 
#		And user clicks on Login button
#		Then user gets warning message
#
#Scenario: Login without any credentials
#		Given user is on login page
#		When No username password
#		And user clicks on login button
#		Then user gets warning message
