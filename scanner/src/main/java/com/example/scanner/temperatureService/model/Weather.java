package com.example.scanner.temperatureService.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

	@JsonProperty("weatherObservations")
	private List<WeatherList> weatherObservations;

	
	public Weather() {
	}
	
	
	
	
}
