Feature: CRUD de Clientes

  # Test para obtener un cliente por su ID
  Scenario: Obtener Cliente por ID
    Given url 'http://localhost:8080/api/cliente/1'
    When method GET
    Then status 200
    And match response.nombre == 'José Lema'
    And match response.direccion == 'Otavalo sn y principal'
    And match response.telefono == '098254785'

  # Test para crear un cliente
  Scenario: Crear un nuevo Cliente
    Given url 'http://localhost:8080/api/cliente'
    And request { 
      "nombre": "Carlos Perez", 
      "direccion": "Calle Falsa 123", 
      "telefono": "0999999999", 
      "contrasena": "pass", 
      "estado": true 
    }
    When method POST
    Then status 201
    And match response.clienteId != null

  # Test para actualizar un cliente
  Scenario: Actualizar Cliente
    Given url 'http://localhost:8080/api/cliente/1'
    And request { 
      "nombre": "José Lema Actualizado", 
      "direccion": "Otavalo sn y principal", 
      "telefono": "098254785", 
      "estado": true 
    }
    When method PUT
    Then status 200
    And match response.nombre == 'José Lema Actualizado'

  # Test para eliminar un cliente
  Scenario: Eliminar Cliente
    Given url 'http://localhost:8080/api/cliente/1'
    When method DELETE
    Then status 204
