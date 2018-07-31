Feature: SignIn
  This feature verifies the Sign In Functionality
  Scenario: Sign In
    Given app opened
    And on the Sign In page
    When user enters email
    And user enters password
    And taps the Sign In Button
    Given the email is correct
    And the password is correct
    Then the user is Signed In