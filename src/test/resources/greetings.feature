Feature: Greetings in various languages

  @done
  Scenario: Greetings in french
    Given I speak "french"
    When I greet "John"
    Then I say "Bonjour John !"

  @done
  Scenario: Greetings in english
    Given I speak "english"
    When I greet "John"
    Then I say "Hello John!"

  @todo
  Scenario: Greetings in spanish
    Given I speak "spanish"
    When I greet "John"
    Then I say "¡Hola John !"
