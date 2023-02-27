package im.proyectoFihoca.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import im.proyectoFihoca.entity.Cadena;



@Repository
//@Service
public interface BrandRepository extends JpaRepository<Cadena, Long> {
	
	
}
