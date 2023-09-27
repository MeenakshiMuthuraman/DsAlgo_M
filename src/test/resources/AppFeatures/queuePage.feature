Feature: Queue Page feature

  
  Scenario Outline:  All navigations in Main queue page 
  	Given user is logged in to DS Algo portal
    Given user is on the "queue" after logged in
    When The user clicks "<pageName>" link from main queue page
		Then check the title of the page "<pageName>"
	
  
   Examples:
   | pageName |
   |Implementation of Queue in Python | 
   |Implementation using collections.deque | 
   |Implementation using array| 
   |Queue Operations|
   
   Scenario Outline: All links in queue page redirected to tryeditor with run button to test
   
   	Given user is on the "queue" after logged in
   	And The user clicks "<pageName>" link from main queue page
   	When user clicks try here button
		Then user should be redirected to a page having an tryEditor with a Run button to test
		
		 Examples:
   | pageName |
   |Implementation of Queue in Python | 
   |Implementation using collections.deque | 
   |Implementation using array| 
   |Queue Operations|
   
Scenario Outline: The user is able run code in tryEditor for Implementation of Queue in Python page
	
		
		Given The user is in "Implementation of Queue in Python" queue page having tryEditor with Run button
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

Scenario Outline: The user is able run code in tryEditor for Implementation of Queue in Python page
	
		
		Given The user is in "Implementation using collections.deque" queue page having tryEditor with Run button
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

Scenario Outline: The user is able run code in tryEditor for Implementation of Queue in Python page
	
		
		Given The user is in "Queue Operations" queue page having tryEditor with Run button
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user is able run code in tryEditor for Implementation of Queue in Python page
	
		
		Given The user is in "Implementation using array" queue page having tryEditor with Run button
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |