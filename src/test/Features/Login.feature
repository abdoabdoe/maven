Feature: Login successfully

  Scenario: User could log in with valid email and password
  Given user navigate to login
  When user enter valid username and password
  And user click on the login button

  #Expect scenario
    Then user could login



  Test Scenarios:

  SC2- User could log in with valid email and password
  SC3- User could reset his/her password successfully
  SC4- Logged User could search for any product
  SC5- Logged User could switch between currencies US-Euro
  SC6- Logged user could select different Categories
  SC8- Logged user could select different tags
  SC9- Logged user could add different products to Shopping cart
  SC10- Logged user could add different products to Wishlist
  SC11- Logged user could add different products to compare list
  SC12- Create successful Order