
Feature: Stack feature

Background:

  Given  user is on the "stack" after logged in
  
   
   Scenario Outline: User navigates to different stack page and try codeeditor with valid and invalid code
   
   	When The user clicks "<pageName>" link from main stack page
   	Then check the title of the page "<pageName>"
   	
   	When user clicks try here button
		Then user should be redirected to a page having an tryEditor with a Run button to test
		
		
		When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
		And  The user clicks on run button
    Then The user should be presented with Run result
    
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter invalid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    And  The user clicks on run button
    Then The user should get error message for invalid code
		Examples:
  		| pageName            | Sheetname  | RowNumber |
  		| Operations in Stack | pythonCode | 0 |
 			| Implementation      | pythonCode | 0 |
  		| Applications        | pythonCode | 0 |
  

		