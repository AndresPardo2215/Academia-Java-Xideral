package com.weatherController;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ciudades = {"CDMX", "Monterrey", "Mérida", "Puebla"};
		
		WeatherController wc = WeatherController.getInstance();
		
		
		for (String nombreCiudad : ciudades) {
            System.out.println("Clima en " + nombreCiudad + ": " + wc.getWeather());
        }

	}

}
