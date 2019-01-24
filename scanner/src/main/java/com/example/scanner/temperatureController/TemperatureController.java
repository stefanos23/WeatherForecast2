package com.example.scanner.temperatureController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.scanner.countryService.CountryRepository;
import com.example.scanner.countryService.model.countryIsoResponse.Country;
import com.example.scanner.countryService.model.countryIsoResponse.Geonames;
import com.example.scanner.temperatureService.TemperatureRepository;
import com.example.scanner.temperatureService.model.Weather;

@RestController
public class TemperatureController {

	private final CountryRepository countryRepository;
	private final TemperatureRepository temperatureRepository;

	@Autowired
	TemperatureController(CountryRepository countryRepository, TemperatureRepository temperatureRepository) {
		this.countryRepository = countryRepository;
		this.temperatureRepository = temperatureRepository;
	}

	@RequestMapping("/weather")
	public Weather weather(@RequestParam(value = "name", defaultValue = "World") String name) {

		Geonames names = countryRepository.getAxesByCountryIso(name);
		Country country = names.getCountry();

		Weather obs2 = temperatureRepository.getTemperatureByAxesBreakdown(country.getWest(), country.getEast(),
				country.getNorth(), country.getSouth());
		return obs2;

	}

}
