package com.singleton.v1;

public class ConexionDB {
	
	//has a
	static private ConexionDB conDb = new ConexionDB();
	static private int contador;
	
	private ConexionDB(){
		System.out.println("paso por constructor");
		contador++;
		
	}
	
	public static ConexionDB getInstance(){
		return conDb;
	}
	
	static int getContador() {
		return contador;
	}
	

}
