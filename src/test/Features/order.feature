Feature: order successfully

  Scenario: User could order an product successfully
    Given user navigate to an product
    When user choose the product that want to have
    And user click on product order

  #Expect scenario
    Then user could go to the ordering page  and order successfully