Feature: Graph Page feature

  
  Scenario Outline:  All navigations in graph page 
  	Given user is logged in to DS Algo portal
    Given user is on the "graph" after logged in
    When The user clicks "<pageName>" link from main graph page
		Then check the title of the page "<pageName>"
	
  
   Examples:
   |pageName|
   |Graph| 
   |Graph Representations| 

Scenario Outline: All links in graph page redirected to tryeditor with run button to test
   
   	Given user is on the "graph" after logged in
   	And The user clicks "<pageName>" link from main graph page
   	When user clicks try here button
		Then user should be redirected to a page having an tryEditor with a Run button to test
		
Examples:
   |pageName|
   |Graph| 
   |Graph Representations| 

Scenario Outline: The user is able run code in tryEditor for Graph page
	
		
		Given The user is in "Graph Representations" graph page having tryEditor with Run button
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |


Scenario Outline: The user is able to get error message while run invalid code in tryEditor for Graph page
	
		
		Given The user is in "Graph Representations" graph page having tryEditor with Run button
    When The user enter invalid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    And The user clicks on run button
    Then The user should error message for invalid code
    
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
