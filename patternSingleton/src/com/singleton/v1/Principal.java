package com.singleton.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V1");
		
		ConexionDB conn1 = ConexionDB.getInstance();
		ConexionDB conn2 = ConexionDB.getInstance();
		ConexionDB conn999 = ConexionDB.getInstance();
		
		System.out.println(conn1);
		System.out.println(conn2);
		System.out.println(conn999);
		
		System.out.println(ConexionDB.getContador());

	}

}
