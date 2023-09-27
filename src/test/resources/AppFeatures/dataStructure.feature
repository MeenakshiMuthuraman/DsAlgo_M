Feature: Data Structure Module of Ds-Algo website.
User should be navigated to Data StructuresIntoduction page.
User should be able to navigate to time complexity page.
user should be able to navigate to practise questions page.
The user should be redirected to a page having an tryEditor with a Run button to test

#use case 28
Scenario: User should be navigated to Data StructuresIntoduction page.
Given User is logged into Ds-Algo website.
When user clicks get started button below the Data Structure Introduction
Then User should be navigated to "Data Structures-Introduction" page.

#use case 29
Scenario: User should be able to navigate to time complexity page.
Given The user is in the Data structures-Introduction page
When The user clicks the Time Complexity page link
Then User should be navigated to "Time Complexity" page.

#use case 31
Scenario: The user should be redirected to a page having an tryEditor with a Run button to test
Given The user clicks the Time Complexity page link
When The user clicks Try Here button on Data Structure
Then user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user is able run code in tryEditor for Data Structure page
	
Given The user is in a page having an tryEditor with a Run button to test
When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
And The user clicks on run button
Then The user should be presented with Run result
 		
 Examples:  
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

#use case 30
Scenario: user should be able to navigate to practise questions page.
Given The user is in the Data structures-Introduction page
And The user clicks the Time Complexity page link
When The user clicks the Practise questions link
Then User should be navigated to "Practice Questions" page of Data Structures




