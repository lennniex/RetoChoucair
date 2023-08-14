Feature: Registro en uTest

  @ScenarioSinEjemplos
  Scenario: Registrarse en uTest
    Given que Lennin quiere registrarse en uTest
    When él completa el formulario de información personal
    And él completa el formulario de dirección
    And él completa el formulario de dispositivos
    And él completa el formulario de seguridad
    Then Lennin debe ver que se ha completado el registro
