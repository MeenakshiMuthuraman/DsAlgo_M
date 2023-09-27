Feature: Home Page feature


#Scenario:
  #	Given user is on Ds Algo Portal page with signIn link
  #	When user clicks getstarted button
  #	Then user is Ds Algo Portal with register and signin link
  	
   
  Scenario Outline: user is on the Page after logged in 

    Given user is logged in to DS Algo portal
    When user clicks "<page_name>" page
    Then check the title of the page "<title>"


    Examples: 

      | page_name  | title |
      | data-structures-introduction | Data Structures-Introduction |
      | array | Array |
      |linked-list| Linked List |
      |stack| Stack |
      |queue| Queue |
      |tree| Tree |
      |graph| Graph |    
 
#Scenario Outline: Dropdown menu Data Structures with sign-in link
 #
 #		Given user is logged in to DS Algo portal
 #		When user clicks on dropdown DataStructures
 #		And user clicks "<page_name>" page in dropdown Menu
 #		Then check the title of the page "<title>"
#Examples: 
      #| page_name  | title |
      #| data-structures-introduction | Data Structures-Introduction |
      #| array | Array |
      #|linked-list| Linked List |
      #|stack| Stack |
      #|queue| Queue |
      #|tree| Tree |
      #|graph| Graph |
