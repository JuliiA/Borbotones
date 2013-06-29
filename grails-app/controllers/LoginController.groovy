import ar.unlam.edu.Cancion
import ar.unlam.edu.Usuario
import ar.unlam.edu.Lista

class LoginController {

    def index() { 
		render view:'login'
	}
		
	def irPrincipal() {
		render view:'/canciones/Canciones'
	}
	
	def logout() {
		render view:'login	'
	}
	
	def authenticate(String username, String password) {
		def usuarioLogin = Usuario.findByNameAndPass(username, password)
		if (username == usuarioLogin.name && password == usuarioLogin.pass) {
//			def usuario = new Usuario()		
//			usuario.name = username
//			usuario.pass = password
			
//			usuario.save(true)
			session.setAttribute('usuarioLogeado', usuarioLogin)
			session.setAttribute('user', username)
//			session.setAttribute('pass', username)
			def canciones = Cancion.list()
//			def usuarios = Usuario.list()
//			def listas = Lista.list()
			render view:'../index/index',model:[canciones:canciones]
			
		} else {
			flash.message = 'Usuario o password incorrectos'
			render view:'login'
		}
}
	
	def crearUsuario(String username, String password) {
				
		def usuario = new Usuario()		
		usuario.name = username
		usuario.pass = password
		
		usuario.save(true)
		session.setAttribute('username', username)
		session.setAttribute('password', password)
		
		render view:'../index/index'
		
	}
}

