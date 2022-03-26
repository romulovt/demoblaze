#Autor: Verde Trujillo Luis R.

  Feature:Agregar producto en Demoblaze
    Como usuario web
    Quiero ingresar a Demoblaze
    Para dar de alta un usuario, loguearme, agregar una laptop al carrito y cerrar sesion

    Scenario Outline: Agregar producto al carrito
      Given que el usuario web ingresa a Demoblaze
      And da de alta una cuenta ingresando el <userName> y el <password>
      And el usuario web se loguea
      When selecciona la categoria Laptops
      And el agrega una laptop al carrito
      Then se muestra la laptop en la opcion cart
      And el usuario cierra sesion
      Examples:
        | userName | password |
        | 'luis19'  | '123'    |





