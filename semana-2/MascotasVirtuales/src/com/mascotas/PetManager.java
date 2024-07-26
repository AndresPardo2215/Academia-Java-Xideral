package com.mascotas;

import java.util.Scanner;

public class PetManager {
	
	private PetService ps;
	
	//constructor con inyección de dependencia
	public PetManager(PetService ps) {
		this.ps = ps;
	}
	
	Scanner scn = new Scanner(System.in);
	
	private void start() {
		while(true) {
			System.out.println("""
					Opciones disponibles:
					1 - Añadir una mascota
					2 - Eliminar una mascota
					3 - Listar todas las mascotas
					4 - Salir
					""");
			System.out.println("Escribe el numero de la opción");
			int opcion = scn.nextInt();
			switch (opcion) {
			case 1: 
				System.out.println("Escribe el nombre de la mascota");
				String nombre = scn.next();
				System.out.println("Escribe su edad en numero entero");
				int edad = scn.nextInt();
				System.out.println("¿que tipo de mascota es? (perro, gato, etc.)");
				String tipo = scn.next();
				Pet pet = new Pet(nombre, edad, tipo);
				ps.addPet(pet);
				break;
			case 2:
				System.out.println("Escribe el nombre de la mascota que deseas eliminar");
				String name = scn.nextLine();
				ps.removePet(name);
				break;
			case 3:
				ps.listPets();
				break;
			case 4:
				break;
			default:
				System.out.println("opcion no válida, intenta de nuevo");
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		
		//inicializar petService
		PetService ps = new PetServiceImpl();
		
		//crear una instancia de petManager
		PetManager pm = new PetManager(ps);
		
		//iniciar la aplicación
		pm.start();
		
		
		
	}

}
