@LoginFlow
  Feature: Meetup Registration

    Background:
      Given the user is on the meetup homepage
      When the user clicks on "Join Meetup" button

      Scenario Outline: Verifying Buttons
        Then the user should verify if "<button>" is displayed

        Examples:
          [button]
          [Facebook]
          [Google]
          [Apple]

        Scenario: Verifying email option
          Then the user should verify if "Sign up with email" is provided
