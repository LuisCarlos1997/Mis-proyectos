Feature: I as a user want to buy an accessory on the bonbonite page

  Scenario: buy accessory
    Given Luis open pages
    When I write my credencials
      | cedula     | contrasena    |
      | 1077475647 | LCvalencia11. |
    And I choose the accessory that I want to compare
    Then the purchase of the accessory is successful