package com.example.scanner.countryService.model.countryIsoResponse;

import javax.xml.bind.annotation.XmlAttribute;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

	@XmlAttribute(name="west")
	Float west1;
	@XmlAttribute(name="north")
	Float north1;
	@XmlAttribute(name="east")
	Float east1;
	@XmlAttribute(name="south")
	Float south1;
	public Float getWest() {
		return west1;
	}
	public void setWest(Float west) {
		this.west1 = west;
	}
	public Float getNorth() {
		return north1;
	}
	public void setNorth(Float north) {
		this.north1 = north;
	}
	public Float getEast() {
		return east1;
	}
	public void setEast(Float east) {
		this.east1 = east;
	}
	public Float getSouth() {
		return south1;
	}
	public void setSouth(Float south) {
		this.south1 = south;
	}
	
	
}
