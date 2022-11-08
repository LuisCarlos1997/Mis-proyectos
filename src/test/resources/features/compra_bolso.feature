Feature: I, as a user, want to buy a pair of shoes from the bon-bonite store
  Scenario: buy shoes

    Given Luis open pages
    When I write my credencials
      | cedula     | contrasena    |
      | 1077475647 | LCvalencia11. |
    And I choose in bag to buy
    Then I make the purchase of the bag successfully
