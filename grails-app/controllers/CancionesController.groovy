import ar.unlam.edu.Cancion
import ar.unlam.edu.Usuario
import ar.unlam.edu.Lista

class CancionesController {

    def index() {
	}
	
	def crearListaDeCanciones(){
		render(view:'createPlayList')
	}
	
	def ListarCanciones(){
		Cancion.list()		
	}
	
	def cantEstrellas(){
		def cant = params
		
	}
}
