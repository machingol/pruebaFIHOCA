package im.proyectoFihoca.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import im.proyectoFihoca.entity.Cadena;
import im.proyectoFihoca.entity.Prices;




@Repository
public interface PricesRepository extends JpaRepository<Prices, Long> {
	 

	  List<Prices> findByIdAndProductId(Cadena cadena,Long product);

	  /*
	   * Deducciones del enunciado
	   * 	-	SI no he entendido mal el enunciado... es posible que ocurra lo siguiente:
	   * 			-	En una misma fecha haya 2 productos (price_list) con la misma prioridad...
	   * 			-   Según el enunciado.. podia introducir nuevos campos en la tabla y demás, pero no modificar los existentes, 
	   * 				Yo lo que hubiese hecho es crear los campos de fechas de tal forma que se pueda hacer toda la logica que 
	   * 				tengo en el service en la query.. que podría quedar de tal forma (revisarla etc) 
	   * 			-	Con ello nos quedariamos con la mayorPrioridad entre unas fechas, para luego buscar la info con ella
	   */
	  
		//	  @Query("SELECT * "
		//		+ "    FROM Prices P "
		//		+ "        INNER JOIN (SELECT MAX(priority) AS MaxPriority "
		//		+ "                        FROM Prices l "
		//		+ "                        WHERE l.productId = :productId  AND l.Cadena = :BRAND_ID AND l.startDate <= :date AND l.endDate >= :date) q "
		//		+ "            ON  P.productId = :productId  AND P.Cadena = :BRAND_ID AND P.startDate <= :date AND P.endDate >= :date "
		//		+ "                AND P.priority = q.MaxPriority ") 
		//List<Prices> findByBrand_Product(Cadena BRAND_ID, Integer productId,Date date);


}
