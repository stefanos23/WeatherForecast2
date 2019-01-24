package com.example.scanner.temperatureService;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.scanner.cacheService.cacheMaintenance;
import com.example.scanner.temperatureService.model.Weather;

@Component
public class SimpleTemperatureRepository implements TemperatureRepository, cacheMaintenance {

	private void simulateSlowService() {
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Scheduled(fixedRate = 10000)
	@CacheEvict(value = "Weather2", allEntries = true)
	public void clearCache() {
	}

	@Override
	@Cacheable("Weather2")
	public Weather getTemperatureByAxesBreakdown(Float l, Float r, Float u, Float d) {
		simulateSlowService();
		RestTemplate restTemplate = new RestTemplate();
		String request = "http://api.geonames.org/weatherJSON?north=" + u + "&south=" + d + "&east=" + r + "&west=" + l
				+ "&username=ferryscanner";
		Weather quote = restTemplate.getForObject(request, Weather.class);

		return quote;
	}
}
