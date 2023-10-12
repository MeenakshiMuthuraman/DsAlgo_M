@tag
Feature: Tree Feature

Scenario Outline: When click on Topics in Tree page, user is redirected to tryeditor with run button to test
 
	Given user is on the "tree" after logged in
  When The user clicks "<pageName>" link from main tree page
  And user clicks try here button
	Then user should be redirected to a page having an tryEditor with a Run button to test
	And The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
	And The user clicks on run button
	Then The user should be presented with Run result
	Examples:
	|pageName 					| Sheetname 					| RowNumber|
  |Overview of Trees 	| pythonCode 					| 0	|
  |Terminologies 			| pythonCode 					| 0	|
  |Types of Trees 		| pythonCode 					| 0	|
  |Tree Traversals		|pythonCode 					| 0	|
  |Traversals-Illustration|pythonCode 			| 0	|
  |Binary Trees				|pythonCode 					| 0	|
	|Types of Binary Trees|pythonCode 				| 0	|
	|Implementation in Python|pythonCode 			| 0	|
	|Binary Tree Traversals|pythonCode 				| 0	|
	|Implementation of Binary Trees|pythonCode| 0	|
	|Applications of Binary trees|pythonCode 	| 0	|
	|Binary Search Trees|pythonCode 					| 0	|
	|Implementation Of BST|pythonCode 				| 0	|
	

Scenario:
	Given The user is in the Implementation Of BST page after logged in
	When The user clicks "Practice Questions" link
 	Then The user should be directed to "practice" Page
 		
 		
 