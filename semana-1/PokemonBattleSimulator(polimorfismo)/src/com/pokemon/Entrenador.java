package com.pokemon;
import java.util.ArrayList;
import java.util.List;

public class Entrenador {

	private String nombre;
	private List<Pokemon> equipo = new ArrayList<>();
	
	public Entrenador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarPokemon(Pokemon pokemon) {
		equipo.add(pokemon);
	}
	
	public void entrenarPokemon() {
        System.out.println(nombre + " está entrenando a su equipo!");
        for (Pokemon pokemon : equipo) {
            System.out.println(pokemon.getNombre() + " está entrenando!");
       }
	}
	
	
}
