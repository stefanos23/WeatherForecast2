package com.example.scanner.temperatureService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherList {


	@JsonProperty("stationName")
	String stationName;
	@JsonProperty("temperature")
	double temperature;
	
	
	public WeatherList() {
	}
	
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
}
