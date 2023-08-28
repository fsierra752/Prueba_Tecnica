Feature: usuarios

  Background:
    * url urlPetStoreUsuarios

  Scenario: Crear Usuarios
    * def dataUser = read('../data/creacionUsuarios.json')
    * set dataUser.username = "brand"
    Given path ''
    When request dataUser
    And method POST
    Then status 200

  Scenario: Consultar Usuarios
    Given path '/brand'
    When method GET
    Then status 200
    And print response