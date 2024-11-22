Feature: Login functionality
  Scenario: Valid Login
    Given I am on the login page
    When I enter valid credentials
    Then I should see the dashboard