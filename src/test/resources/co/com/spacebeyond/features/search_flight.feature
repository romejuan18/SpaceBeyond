#language: es

Característica: Como usuario deseo realizar la busqueda de viajes interplanetarios

  @SpaceBeyondTest
  Escenario: Busqueda de viaje al espacio ingresando fechas, numero de adultos y niños para el planeta Madan
    Dado la pagina web de viajes espaciales
    Cuando se ingresa la fecha de inicio del viaje
    Y se ingresa la fecha de regreso del viaje
    Y se ingresa el numero de adultos y niños a viajar
    Entonces se selecciona un planeta para viajar
    Y se diligencia la reservación del viaje