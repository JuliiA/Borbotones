package ar.unlam.edu

class Lista {
	String name
	static hasMany = [canciones:Cancion]
	static belongsTo = [usuarios:Usuario]
}
