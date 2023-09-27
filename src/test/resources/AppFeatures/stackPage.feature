
Feature: Main Stack Page Navigation through link feature

  
  Scenario Outline:  All navigations in Main stack page 
  	Given user is logged in to DS Algo portal
    Given user is on the "stack" after logged in
    When The user clicks "<pageName>" link from main stack page
		Then check the title of the page "<pageName>"
		
    #And The user should be redirected to a page having an tryEditor with a Run button to test
    #Then The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    #And The user clicks on run button
    #And The user should be presented with Run result

  
   Examples:
   | pageName |
   |Operations in Stack | 
   |Implementation | 
   |Applications | 
   
   Scenario Outline: Operation in stack page redirected to tryeditor with run button to test
   
   	Given user is on the "stack" after logged in
   	And The user clicks "<pageName>" link from main stack page
   	When user clicks try here button
		Then user should be redirected to a page having an tryEditor with a Run button to test
		
		 Examples:
   | pageName |
   |Operations in Stack | 
   |Implementation | 
   |Applications | 
   
Scenario Outline: The user is able run code in tryEditor for Operation in Stack page
	
		
		Given The user is in "operation in stack" stack page having tryEditor with Run button
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

		