package im.proyectoFihoca.main;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.springframework.http.ResponseEntity;
import im.proyectoFihoca.controller.PricesController;
import im.proyectoFihoca.model.Products;
import im.proyectoFihoca.services.ToDoServiceImpl;

@ExtendWith(MockitoExtension.class)
public class PricesControllerTest
{
    @InjectMocks
    PricesController employeeController;

    @Mock
    ToDoServiceImpl employeeDAO;


    @Test
    public void testFindAll() throws Exception {
        Products prod1 = new Products(1L, 35455L, 1, 30.50, "2020-06-14-00.00.00", "2020-12-31-23.59.59");
        
        List<Products> listaProds= new ArrayList<Products>();
        listaProds.add(prod1);

		when(employeeDAO.getProducts(1, 35455L, "2020-06-14-10.00.00")).thenReturn(listaProds);

        ResponseEntity<Collection<Products>> result = employeeController.findByPublished(1, 35455L, "2020-06-14-10.00.00");

        ArrayList<Products> salidaLista = (ArrayList<Products>) result.getBody();
        
        assertThat(salidaLista.get(0).getProductId()).isEqualTo(listaProds.get(0).getProductId());
    }
}
