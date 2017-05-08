@SignUpFeature
Feature: Sign Up
  I want to use this template for my feature file

  @SignUp1
  Scenario: Sign Up successfully with valid data
    Given I am in Sign Up page
    When I input valid "firstname", "lastname", "0123456789", "ab4@gmail.com", "abc123", "abc123"
    And click Sign Up button
    Then I sign up successfully and system redirect me to Home page with my account
