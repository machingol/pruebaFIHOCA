package im.proyectoFihoca.services;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import im.proyectoFihoca.entity.Cadena;
import im.proyectoFihoca.entity.Prices;
import im.proyectoFihoca.model.Products;
import im.proyectoFihoca.repository.PricesRepository;
import im.proyectoFihoca.utils.UtilsFihoca;



@Service
public class ToDoServiceImpl implements ToDoBaseService{

	@Autowired
	PricesRepository pricesRepository;
	
	@Override
	public Collection<Products> getProducts(int id, Long product, String fecha) throws Exception {
		// TODO Auto-generated method stub
		
		Collection<Products> listaProductos = new ArrayList<Products>();
		Integer mayorPrioridad = -1;

		try {
			//Preparamos la llamada a la BBDD
			Cadena cad = new Cadena();
				cad.setEid(id);
			List<Prices> itemSalvados = pricesRepository.findByIdAndProductId(cad,product);	
			
			//Y ya tratamos la respuesta de la BBDD
			if (itemSalvados != null && !itemSalvados.isEmpty()) {
				for (int idx = 0; idx < itemSalvados.size(); idx++) {
					
					if (UtilsFihoca.fechaCorrecta(itemSalvados.get(idx).getStartDate(), itemSalvados.get(idx).getEndDate(), fecha)) {
						//Fecha correcta
						Products item = new Products();
							item.setProductId(itemSalvados.get(idx).getProductId());
							item.setPriceList(itemSalvados.get(idx).getPriceList());
							item.setPrice(itemSalvados.get(idx).getPrice());
							item.setEndDate(itemSalvados.get(idx).getEndDate());
							item.setStartDate(itemSalvados.get(idx).getStartDate());
							item.setBRAND_ID(id);
						
						//Nos quedamos con la mayor prioridad
						if (itemSalvados.get(idx).getPriority() > mayorPrioridad) {
							//Si encontramos un con mayor prioridad:
							// - Reiniciamos la lista
							// - Nos quedamos ese producto
							// - Y ponemos el contador de mayorPrioridad
							listaProductos =  new ArrayList<Products>();
							listaProductos.add(item);
							mayorPrioridad = itemSalvados.get(idx).getPriority();
						}else if (itemSalvados.get(idx).getPriority() == mayorPrioridad) {
							//Si encontramos uno de igual prioridad... pues lo guardamos
							listaProductos.add(item);

						}
					}else {
						//Fecha sin informacion
					}
				}
			}

			return listaProductos;
			
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}}
