package com.example.scanner.temperatureService;

import com.example.scanner.temperatureService.model.Weather;

public interface TemperatureRepository {

	public Weather getTemperatureByAxesBreakdown(Float l, Float r, Float u, Float d);

}
