Feature: aplicacion fichap

  @FichapLogin
  Scenario Outline: el usuario inicia aplicacion Fichap y se loguea
    Given el usuario abre la aplicacion y esta cargada correctamente
    When el usuario ingresa su <email> y <password> y hace click en 'Iniciar Sesion'
    And el usuario se toma una foto
    Then el usuario se encuentra en la pantalla para fichar


    Examples:
      | email             | password |
      | emavid4@gmail.com | 129998   |

  @FichapChangePassword
  Scenario Outline: el usuario cambia de contraseña
    Given el usuario inicia la aplicacion y carga correctamente
    When ingresa su <email> y <password> y clickea en 'Iniciar Sesion'
    And se toma una foto
    And el usuario se encuentra en la pantalla principal
    And el usuario cambia a la pantalla de contrasenia
    And el usuario ingresa la nueva <newPassword> y lo confirma
    Then la contrasenia es cambiada exitosamente

    Examples:
      | email             | password | newPassword |
      | emavid4@gmail.com | 129998   | 129999      |

