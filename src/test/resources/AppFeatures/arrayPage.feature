

Feature: ArrayPage feature

		  
Scenario: user is able to navigate to a page having an tryEditor from Applications of Array page
    Given  user is logged in to DS Algo portal
    And user is on the "array" after logged in 
    When user is on the Applications of Array after array page
    And user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able run code in tryEditor for Applications of Array page
	
		Given user is on the Applications of Array after array page
 		And The user is in a page having an tryEditor with a Run button to test
 		When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
 		And The user clicks on run button
 		Then The user should be presented with Run result
 		
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
