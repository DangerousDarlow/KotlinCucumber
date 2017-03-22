Feature: Operation
  Arithmetic operations can be performed

  Scenario: Addition returns the sum of two values
    When I add numbers 1.23 and 4.56
    Then the result is 5.79