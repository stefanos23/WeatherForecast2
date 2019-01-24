package com.example.scanner.countryService;

import com.example.scanner.countryService.model.countryIsoResponse.Geonames;

public interface CountryRepository {

	Geonames getAxesByCountryIso(String IsoCode);

}
