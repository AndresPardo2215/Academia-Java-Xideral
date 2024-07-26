package com.mascotas;

public class Pet {

	String nombre;
	int edad;
	String tipo;
	
	public Pet(String nombre, int edad, String tipo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pet [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
