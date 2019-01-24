package com.example.scanner.temperatureController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.scanner.countryService.CountryRepository;
import com.example.scanner.countryService.SimpleCountryRepository;
import com.example.scanner.countryService.model.countryIsoResponse.Country;
import com.example.scanner.countryService.model.countryIsoResponse.Geonames;
import com.example.scanner.temperatureService.TemperatureRepository;
import com.example.scanner.temperatureService.model.Weather;

@RestController
public class TemperatureController {

	private final CountryRepository asd;
	private final TemperatureRepository temp;
	
	@Autowired
	TemperatureController(CountryRepository asd, TemperatureRepository temp){
		this.asd = asd;
		this.temp = temp;
	}
	
	
/*	@RequestMapping("/greeting2")
    public Quote greeting2(@RequestParam(value="name", defaultValue="World") String name) {
		

		RestTemplate restTemplate = new RestTemplate();
	    Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
        return quote;
    }
	
	//thats the good one
	@RequestMapping("/greeting3")
    public Geonames greeting3(@RequestParam(value="name", defaultValue="World") String name) {
		
		SimpleCountryRepository asd = new SimpleCountryRepository();
		Geonames la = asd.getAxesByCountryIso(name);
		
        return la;
    }*/
	
	@RequestMapping("/greeting4")
    public Weather greeting4(@RequestParam(value="name", defaultValue="World") String name) {
		
		Geonames la = asd.getAxesByCountryIso(name);
		//geSt
		Country kaka = la.getCountry();
		
		Weather obs2 = temp.getTemperatureByAxesBreakdown(kaka.getWest(), kaka.getEast(),kaka.getNorth(),  kaka.getSouth()) ;
        return obs2;
    }
	
}
