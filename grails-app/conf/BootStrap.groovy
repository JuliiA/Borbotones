import ar.unlam.edu.Cancion
import ar.unlam.edu.Usuario
import ar.unlam.edu.Lista

class BootStrap {

    def init = { servletContext ->
		
	// Canciones 
		def cancion1 = new Cancion(author: 'Callejeros', name:'Ahogados de razón', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(1).mp3')
		cancion1.save(flush:true)
		def cancion2 = new Cancion(author: 'Falsos Profetas', name:'Cinco palabras', estrella:0, puntuacion:0, genero: "Rock", url:'http://localhost:80/Musica/falsos.mp3')
		cancion2.save(flush:true)
		def cancion3 = new Cancion(author: 'Jhon Lennon', name:'Stand by me', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(3).mp3')
		cancion3.save(flush:true)
		def cancion4 = new Cancion(author: 'Las pastillas del abuelo', name:'Amar y envejecer', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(4).mp3')
		cancion4.save(flush:true)
		def cancion5 = new Cancion(author: 'Las pastillas del abuelo', name:'Hasta acá nos ayudo dios', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(5).mp3')
		cancion5.save(flush:true)
		def cancion6 = new Cancion(author: 'Las pastillas del abuelo', name:'Raton', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(6).mp3')
		cancion6.save(flush:true)
		def cancion7 = new Cancion(author: 'Thalia', name:'Te perdiste mi amor', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(7).mp3')
		cancion7.save(flush:true)		
		def cancion8 = new Cancion(author: 'Rio Roma', name:'Tu me cambiaste la vida', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(8).mp3')
		cancion8.save(flush:true)		
		def cancion9 = new Cancion(author: 'Las pastillas del abuelo', name:'Donde esconder tantas manos', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(9).mp3')
		cancion9.save(flush:true)
		def cancion10 = new Cancion(author: 'David Bisbal', name:'Hasta el final', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(10).mp3')
		cancion10.save(flush:true)
		def cancion11 = new Cancion(author: 'Ntvg', name:'Sin pena ni gloria', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(11).mp3')
		cancion11.save(flush:true)
		def cancion12 = new Cancion(author: 'Ntvg', name:'Como brillaba tu alma', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(12).mp3')
		cancion12.save(flush:true)
		def cancion13 = new Cancion(author: 'Ntvg', name:'Fuera de control', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(13).mp3')
		cancion13.save(flush:true)
		def cancion14 = new Cancion(author: 'Ntvg', name:'Nada fue en vano', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(14).mp3')
		cancion14.save(flush:true)
		def cancion15 = new Cancion(author: 'Ntvg', name:'A las nueve', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(15).mp3')
		cancion15.save(flush:true)
		def cancion16 = new Cancion(author: 'Ntvg', name:'Una triste melodia', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(16).mp3')
		cancion16.save(flush:true)
		def cancion17 = new Cancion(author: 'Las pastillas del abuelo', name:'Oportunistas', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(17).mp3')
		cancion17.save(flush:true)
		def cancion18 = new Cancion(author: 'Ntvg', name:'Tan lejos', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(18).mp3')
		cancion18.save(flush:true)
		def cancion19 = new Cancion(author: 'Las pastillas del abuelo', name:'Me juego el corazón', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(19).mp3')
		cancion19.save(flush:true)
		def cancion20 = new Cancion(author: 'Tan bionica', name:'Lunita de tucuman', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(20).mp3')
		cancion20.save(flush:true)
		def cancion21 = new Cancion(author: 'Autenticos decadentes', name:'No me importa el dinero', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(21).mp3')
		cancion21.save(flush:true)
		def cancion22 = new Cancion(author: 'Callejeros', name:'Algo mejor, algo peor', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(22).mp3')
		cancion22.save(flush:true)
		def cancion23 = new Cancion(author: 'Callejeros', name:'Creo', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(23).mp3')
		cancion23.save(flush:true)
		def cancion24 = new Cancion(author: 'Callejeros', name:'¿Cuánto más?', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(24).mp3')
		cancion24.save(flush:true)
		def cancion25 = new Cancion(author: 'Callejeros', name:'Durmiendo en la seccional', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(25).mp3')
		cancion25.save(flush:true)
		def cancion26 = new Cancion(author: 'Callejeros', name:'Ignorante', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(26).mp3')
		cancion26.save(flush:true)
		def cancion27 = new Cancion(author: 'Callejeros', name:'Ilusion', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(27).mp3')
		cancion27.save(flush:true)
		def cancion28 = new Cancion(author: 'Jesse y Joy', name:'¿Con quién se queda el perro?', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(28).mp3')
		cancion28.save(flush:true)
		def cancion29 = new Cancion(author: 'Daddy Yankee', name:'Limbo', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(29).mp3')
		cancion29.save(flush:true)
		def cancion30 = new Cancion(author: 'Rihana', name:'Diamont', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(30).mp3')
		cancion30.save(flush:true)
		def cancion31 = new Cancion(author: 'Calle 13', name:'Latinoamerica', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(31).mp3')
		cancion31.save(flush:true)
		def cancion32 = new Cancion(author: 'Las pastillas del abuelo', name:'Cambios de tiempo!', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(32).mp3')
		cancion32.save(flush:true)
		def cancion33 = new Cancion(author: 'Las pastillas del abuelo', name:'Candombe de resacas', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(33).mp3')
		cancion33.save(flush:true)
		def cancion34 = new Cancion(author: 'Las pastillas del abuelo', name:'Desde la postura', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(34).mp3')
		cancion34.save(flush:true)
		def cancion35 = new Cancion(author: 'Las pastillas del abuelo', name:'Diosa de la transformación', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(35).mp3')
		cancion35.save(flush:true)
		def cancion36 = new Cancion(author: 'Las pastillas del abuelo', name:'Enano', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(36).mp3')
		cancion36.save(flush:true)
		def cancion37 = new Cancion(author: 'Vicentico', name:'Himno de mi corazón', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(37).mp3')
		cancion37.save(flush:true)
		def cancion38 = new Cancion(author: 'Las pastillas del abuelo', name:'Leer y escribir', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(38).mp3')
		cancion38.save(flush:true)
		def cancion39 = new Cancion(author: 'Shakira', name:'Octavo día', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(39).mp3')
		cancion39.save(flush:true)
		def cancion40 = new Cancion(author: 'Calle 13', name:'No hay nadie como tu', estrella:0,puntuacion:0, url:'http://localhost:80/Musica/pista(40).mp3')
		cancion40.save(flush:true)		
		
		/*//Listas de reproduccion
		def lista1 = [cancion1, cancion2, cancion3, cancion4, cancion5]
		def lista2 = [cancion6, cancion7, cancion8]
		
		//Usuarios
			def usuario1 = new Usuario(name: 'Administrador', pass:'123456')
			usuario1.save(flush:true)
			def usuario2 = new Usuario(name: 'Usuario', pass:'123456')
			usuario1.save(flush:true) */
    }
    def destroy = {
    }
}
