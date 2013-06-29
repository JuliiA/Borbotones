package ar.unlam.edu

class Usuario {
	String name
	String pass
	static hasMany = [listas:Lista]
}
