
Feature: Graph feature

Background:

  Given  user is on the "graph" after logged in
  
   
   Scenario Outline: User navigates to different graph page and try codeeditor with valid and invalid code
   
   	When The user clicks "<pageName>" link from main graph page
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
  		| Graph | pythonCode | 0 |
 			| Graph Representations | pythonCode | 0 |
  

		