Feature: Basic validation Meetup

  Background:
    Given the user is on the meetup homepage

  Scenario: Title verification
    Then verify the title contains "Meetup"

  Scenario: Url verification
    Then verify the url contains "https://www.meetup.com/"