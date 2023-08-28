Feature: mascotas

  Scenario: Consultar mascotas vendidas
    Given url 'https://petstore.swagger.io/v2/pet/findByStatus?status=sold'
    When method GET
    Then status 200
    * def responseJson = response
    * def soldPets = responseJson
    * def petNames = karate.map(soldPets, function(pet){ return { id: pet.id, name: pet.name } })
    * print petNames
    * def nameCounts = {}
    * eval karate.forEach(petNames, function(name){ nameCounts[name.name] = nameCounts[name.name] == null ? 1 : nameCounts[name.name] + 1 })
    * print nameCounts



















