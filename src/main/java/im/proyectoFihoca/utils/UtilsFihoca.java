package im.proyectoFihoca.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UtilsFihoca {
	public static boolean fechaCorrecta(String fechaIniBBDD,String fechaFinBBDD,String fechaBusqueda) {
		boolean devolver = false;
		
		try {
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");

			Date diaIni 		= formatter.parse(fechaIniBBDD);				
			Date diaFin 		= formatter.parse(fechaFinBBDD);
			Date diaBusqueda 	= new Date();
			if (fechaBusqueda != null) {
				 diaBusqueda 	= formatter.parse(fechaBusqueda);
			}

			if (diaBusqueda.compareTo(diaIni) >0 && diaBusqueda.compareTo(diaFin) <0) {
				//Entre fechas
				devolver = true;
			}else {
				//No esta entre fechas
			}


		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return devolver;
	}
}
