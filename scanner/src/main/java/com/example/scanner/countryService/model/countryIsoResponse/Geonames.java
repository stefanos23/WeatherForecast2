package com.example.scanner.countryService.model.countryIsoResponse;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "geonames")
public class Geonames {
	@XmlElement(name = "country")
	Country country1;

	public Country getCountry() {
		return country1;
	}

	public void setCountry(Country country) {
		this.country1 = country;
	}

}
