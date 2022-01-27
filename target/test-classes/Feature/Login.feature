Feature: To Validate the Target ExpectMore Payless login functionalitiy

  Background: 
    Given The user should be in target  page
    And Click the page sign button and click sign

  Scenario Outline: To Validate the Functionality with invalid Function
    When The user has to file "<username>" and "<password>"
    And The user has to click the login button
    Then The user Should navigate to the invalid login page

    Examples: 
      | username | password |
      | kamal    |   121212 |
      | nathan   |   151515 |
      | jeevan   |   232343 |

  Scenario: To Create your account Functionality
    Given Click on the page create button to click 
    When The user has to fill Emailaddress,Firstname,LastName,mobilenumber(optional)and create password
    And Keep me sign in button to click
    Then Create an acoount button to click

     