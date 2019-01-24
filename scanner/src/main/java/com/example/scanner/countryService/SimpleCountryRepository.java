package com.example.scanner.countryService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.scanner.countryService.model.countryIsoResponse.Geonames;

@Component
public class SimpleCountryRepository implements CountryRepository {

	@Override
	@Cacheable("Axes")
	public Geonames getAxesByCountryIso(String IsoCode) {

		// simulateSlowService();
		RestTemplate restTemplate = new RestTemplate();
		String request = "http://api.geonames.org/countryInfo?username=ferryscanner&country=" + IsoCode;
		Geonames quote = restTemplate.getForObject(request, Geonames.class);

		return quote;
	}

	private void simulateSlowService() {
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
