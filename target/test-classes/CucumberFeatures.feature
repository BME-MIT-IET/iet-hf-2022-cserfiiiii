Feature: Determine if the input for the number of settlers is valid

  Scenario: Valid positive integer number input
    Given I entered int "4"
    When I test it for input
    Then the result should be "true"

  Scenario: Invalid negative integer number input
    Given I entered int "-2"
    When I test it for input
    Then the result should be "false"

  Scenario: Invalid zero input
    Given I entered int "0"
    When I test it for input
    Then the result should be "false"

  Scenario: Invalid rational number input
    Given I entered int "0.25"
    When I test it for input
    Then the result should be "false"

  Scenario: Invalid string input
    Given I entered int "six"
    When I test it for input
    Then the result should be "false"