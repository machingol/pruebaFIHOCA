# pruebaFIHOCA
Prueba Fihoca - Consulta basica Spring H2

NOTAS:
	  /*
	   * Deducciones del enunciado
	   * 	-	SI no he entendido mal el enunciado... es posible que ocurra lo siguiente:
	   * 			-	En una misma fecha haya 2 productos (price_list) con la misma prioridad...
	   * 			- Según el enunciado.. podia introducir nuevos campos en la tabla y demás, pero no modificar los existentes, 
	   * 				Yo lo que hubiese hecho es crear los campos de fechas de tal forma que se pueda hacer toda la logica que 
	   * 				tengo en el service en la query.. que podría quedar de la forma que tengo en el repository
	   * 			-	Con ello nos quedariamos con la mayorPrioridad entre unas fechas, para luego buscar la info con ella
	   */
