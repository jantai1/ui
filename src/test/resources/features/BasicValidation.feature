Feature: Basic validation

  @googleTest
  Scenario: Google Title verification
    When the user navigates to Google
    And the user searches for "apple"
    Then verify "flower" is in the title of the page