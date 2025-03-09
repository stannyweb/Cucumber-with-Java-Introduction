Feature: Login functionality feature
  In order to login to the site
  as a valid credentials provided
  I want to login successfully


  Scenario: Login Successful
    Given I am in the login page
    When I enter valid username and password
    Then I should see the home page


  Scenario: Login Successful
    Given I am in the login
    When I enter valid username and password
    Then I should see the home page
