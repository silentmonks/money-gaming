Feature: As a new moneygaming.com player
         I want to be able to register using my full details
         So that I can play online casino games

  @test
  Scenario: User selects title, enters first name & surname, checks terms & conditions checkbox and validate DOB error message.
    Given user is on Sign Up page
    And user selects "Mr" title from dropdown
    And user enters "Mike" to first name field
    And user enters "John" to surname field
    And user checks the Terms and Conditions checkbox
    When user enters Join Now button
    Then the "This field is required" error message should be displayed for "DOB"
