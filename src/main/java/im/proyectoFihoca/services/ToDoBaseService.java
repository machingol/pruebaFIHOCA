package im.proyectoFihoca.services;


import java.util.Collection;
import org.springframework.stereotype.Component;
import im.proyectoFihoca.model.Products;


@Component
public interface ToDoBaseService {

	Collection<Products> getProducts(int id, Long product, String fecha) throws Exception;

}
