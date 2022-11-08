Feature: I, as a user, want to log in to the bon-bonite page

  Scenario: Login in the pages
    Given Luis open pages
    When I write my credencials
      | cedula     | contrasena    |
      | 1077475647 | LCvalencia11. |
    Then I successfully entered the page