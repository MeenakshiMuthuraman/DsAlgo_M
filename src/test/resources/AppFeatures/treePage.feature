@tag
Feature: Tree Feature

  @tag1
  Scenario: Opening Overview of Trees link
    Given The user is in the Tree page after logged in
    When The user clicks "Overview of Trees" button
    And The user should be directed to "Tree" Page
    
    
   Scenario: Opening editor from Overview of Trees page
   	Given The user is in the Overview of Trees page after logged in
   	When user clicks try here button
   	Then The user should be redirected to a page having an tryEditor with a Run button to test

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
