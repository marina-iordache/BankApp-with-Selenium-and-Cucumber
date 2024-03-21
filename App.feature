Feature: Bank application tests

  Scenario: The user can see their balance
    Given the user has a bank account with balance of 1000.0 dollars
    Then the balance is 1000.0 dollars

  Scenario: The user can make a withdrawal
    Given the user has a bank account with balance of 1000.0 dollars
    When the user withdraws 200.0 dollars
    Then the balance is 800.0 dollars

  Scenario: The balance cannot be negative
    Given the user has a bank account with balance of 1000.0 dollars
    When the user withdraws 1000.1 dollars
    Then the balance is not negative
