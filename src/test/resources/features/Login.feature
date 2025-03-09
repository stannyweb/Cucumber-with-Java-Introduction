Feature: Login functionality feature
  In order to login to the site
  as a valid credentials provided
  I want to login successfully


  Scenario Outline: Login Successful
    Given I am in the login page
    When I enter valid <username> and <password>
    Then I should see the home page
    Examples:
      | username  | password        |
      | "admin"   | "admin123"      |
      | "Stan"    | "password123"   |
      | "Angelov" | "wrongPassword" |
