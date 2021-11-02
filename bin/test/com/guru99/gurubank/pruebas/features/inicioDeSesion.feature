#language:es
Característica: Inicio de sesion

  Esquema del escenario: Inicios de sesion fallidos
    Dado que estoy en la pagina de inicio de GuruBank
    Cuando ingreso mis credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces valido la presencia de una alerta

    Ejemplos: 
      | Usuario         | Clave         |
      | mngr359366      | ClaveInvalida |
      | usuarioInvalido | UvUhAhE       |
      | usuarioInvalido | CalveInvalida |
