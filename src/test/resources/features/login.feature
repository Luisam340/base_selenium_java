
Feature: Login SauceDemo

  Scenario: Login exitoso
    Given que el usuario está en la página de login
    When ingresa credenciales válidas
    Then debería ver la pantalla de productos
