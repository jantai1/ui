@loginFlow
Feature: LoginFlow

  Background:
    Given the user is on the meetup homepage

  Scenario: Validate Sign Up button is displayed
    Then the user should be able to see "Sign up" button

  Scenario: Validate Login button is displayed
    Then the user should be able to see "Log in" button

  Scenario: Validate Join Meetup button is displayed
    Then the user should be able to see "Join Meetup" button