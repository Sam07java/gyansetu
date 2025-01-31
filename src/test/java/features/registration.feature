Feature: Registration functionality
  Scenario: Validate registration functionality
    Given I am on the registration page
    When I enter Email and password
    Then I should see successfull registration