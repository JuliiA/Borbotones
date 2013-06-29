package proyectograils

import ar.unlam.edu.Cancion;

class BusquedaDeCancionController {

    def index() { 
		
		Cancion busqueda = Cancion.findByAuthor(params.nombre)
		
		if(busqueda!=null)
		render view : "busquedaDeCancion", model:[url: busqueda.url]
		
		else
		{
			Cancion busqueda2 = Cancion.findByName(params.nombre)
			if(busqueda2!=null)
			render view : "busquedaDeCancion", model:[url: busqueda2.url]
			
			else
				{
					Cancion busqueda3 = Cancion.findByGenero(params.nombre)
					if(busqueda3!=null)
						render view : "busquedaDeCancion", model:[url: busqueda3.url]
					else
						render view : "cancionNoEncontrada", model:[error: "Cancion no encontrada"]
				}
				
		
		}
	}
}
