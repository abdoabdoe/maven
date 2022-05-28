Feature: Register successfully

  Scenario: User could register with valid email and password
    Given user navigate to registeration
    When user enter valid data
    And user click on the register button

  #Expect scenario
    Then user could Register
