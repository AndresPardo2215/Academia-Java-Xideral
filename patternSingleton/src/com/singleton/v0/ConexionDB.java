package com.singleton.v0;

public class ConexionDB {
	
	//has a
	static private ConexionDB conDb;
	static private int contador;
	
	private ConexionDB(){
		System.out.println("paso por constructor");
		contador++;
		
	}
	
	public static ConexionDB getInstance(){
		if(conDb == null) {
			conDb = new ConexionDB();
		}
		return conDb;
	}
	
	static int getContador() {
		return contador;
	}
	

}
