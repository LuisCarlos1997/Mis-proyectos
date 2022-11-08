Feature: I, as a user of the bonbonite page, want to give a gift voucher

  Scenario: Gift voucher
    Given Luis open pages
    When I write my credencials
      | cedula     | contrasena    |
      | 1077475647 | LCvalencia11. |
    And I choose the price I want to give away
    Then I make the purchase of the voucher successfully
