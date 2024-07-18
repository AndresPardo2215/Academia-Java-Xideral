package com.weatherController;

import java.util.Random;

public class WeatherController {
	
	private static WeatherController wc;
	
	private String[] weatherTypes = {"soleado", "lluvioso", "nublado", "tormentoso"};
	
	private WeatherController(){
		System.out.println("soy el constructor");
	}
	
	Random random = new Random();
	
	public String getWeather() {
		int aleatoryIndex = random.nextInt(weatherTypes.length);
		String actualWeather = weatherTypes[aleatoryIndex];
		return actualWeather;
	}
	
	
	
	
	
	
	public static WeatherController getInstance() {
		if (wc == null) {
			wc = new WeatherController();
		}
		return wc;
	}
	
	

}
