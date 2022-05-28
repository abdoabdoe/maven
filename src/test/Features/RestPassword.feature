Feature: Rest password successfully

  Scenario: User could rest password
    Given user navigate to forget password
    When user enter Email
    And user click on forget password

  #Expect scenario
    Then user could rest password successfully
