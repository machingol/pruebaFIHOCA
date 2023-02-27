package im.proyectoFihoca.controller;



import java.util.Collection;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import im.proyectoFihoca.model.Products;
import im.proyectoFihoca.services.ToDoServiceImpl;



@RestController
@RequestMapping("/api")

@Service
public class PricesController {
	

	@Autowired
	ToDoServiceImpl toDoServiceImpl;
	

	@GetMapping("/tutorials/published/{idCadena}/{idProducto}")
	public ResponseEntity<Collection<Products>>  findByPublished(@PathVariable Integer idCadena,@PathVariable Long idProducto,
			@RequestParam(value = "fecha", required = false) String fechaBusqueda) {
		
		/*
		 * Se ha realizado de la siguiente manera
		 * 	-	El idCadena e idProducto se pone obligatorio (ya que hay que saber desde donde se consulta y que producto se requiere
		 * 	-	La fecha de consulta es opcional:
		 * 			-	Si se introduce 	-> Se busca sobre esa hora
		 * 			-	Si no se introduce 	-> Se hace una busqueda del dia y hora de busqueda actual
		 * 				
		 */

		try {		
			Collection<Products> listaPrecios = toDoServiceImpl.getProducts(idCadena, idProducto, fechaBusqueda);

			if (listaPrecios != null && !listaPrecios.isEmpty()) {
				
				return new ResponseEntity<>(listaPrecios, HttpStatus.OK);
			}else {	
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}	

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}


}
