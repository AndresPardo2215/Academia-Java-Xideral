package com.mascotas;

import java.util.ArrayList;
import java.util.List;

public class PetServiceImpl implements PetService{

	List<Pet> pets = new ArrayList<>();
	
	
	
	@Override
	public void addPet(Pet pet) {
		pets.add(pet);
	}

	@Override
	public void removePet(String name) {
		pets.remove(name);
	}



	@Override
	public void listPets() {
		for (Pet pet:pets){
			System.out.println(pet.toString());
		}
	}

	

}
