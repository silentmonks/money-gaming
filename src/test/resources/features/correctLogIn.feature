Feature: As a registered moneygaming.com player
         I should insert correct login
         So that I can login successfully

  Scenario: Users password should be 6 characters or longer, contain at least one number and at least one special character
    Given user has a password
    And password should be six or more characters
    And password should contain at least one number
    And password should contain at least one character
    Then user has correct password