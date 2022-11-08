Feature: I as a user want to buy a belt on the bon bonite page
  Scenario: buy belt
    Given Luis open pages
    When I write my credencials
      | cedula     | contrasena    |
      | 1077475647 | LCvalencia11. |
    And I choose the belt I want to buy
    Then the purchase of the belt is successful