@feature1
Feature: Amazon test cases
  I want to use this feature file to run amaon test cases
   
  @amazon @uid 
  Scenario: Validate userid
    Given i open "chrome" and get url "https://www.amazon.in/" test name "AmazonLogin" report name "LoginReport"
    And click signin
    When I enter valid userid "paragguide@yahoo.co.in"
    And click continue button
    Then I error should not come
    But password should come
  
  @amazon @pwd
  Scenario: validate password
   Given userid is valid and password textbox displayed
   When enter a valid password "RMinfotech12#&&"
   Then i should login
   
   @amazon @search 
   Scenario Outline: searching products
    Given i am logged in
    When i search for product <productname> and price <productprice>
    Then product must come
    And close browser
   
   @data1
   Examples:
   | productname | productprice |
   | Shirt | 1200 |
   | Pant | 4500 |
   | Tie | 400 |
   
   @data2
   Examples:
   | productname | productprice |
   | mobile | 15000 |
   | TV | 45000 |
   | AC | 40000 |
   
   @amazon @reg
   Scenario: New User Register
    Given i launch browser "chrome" with url "https://www.amazon.in/" test name "Register test" report name "RegisterReport"
    And take mouse over to sign in and click start here
    When i enter name "parag" with mobile number "9958443384" and create password "GodGod123#" and click submit 
    Then OTP should come
     
   