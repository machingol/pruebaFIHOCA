package im.proyectoFihoca.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Table(name="BRAND")
@Entity
public class Cadena {

	   @Id
	   @GeneratedValue( strategy= GenerationType.AUTO ) 
	   private int id;

	   private String name;
	   
	    @OneToMany( mappedBy = "id")
	    private List<Prices> prices;
	    

	   public int getEid( ) 
	   {
	      return id;
	   }
	   public void setEid(int id)  
	   {
	      this.id = id;
	   }		
	   public String getName() {
			return name;
	   }	
	   public void setName(String name) {
			this.name = name;	
	   }

	
	   



}
