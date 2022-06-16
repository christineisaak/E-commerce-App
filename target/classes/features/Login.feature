Feature: user should be able to login to the system

  #Test Scenario 1
  Scenario: user could login with valid email and password
  Given user open browser
  And user navigate to login page

  When user enter valid email and password
  And user enter login button
  #Expected Result
  Then user login successfully
  And user go to home page



  #Test scenario 2
  Scenario: user could login with invalid username and password
    Given user open browser
    And user navigate to login page

    When user enter
    And user enter login button
  #Expected Result
    Then user login successfully
    And user go to home page