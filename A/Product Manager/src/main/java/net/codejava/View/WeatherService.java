package net.codejava.View;

import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;

import net.codejava.Model.Weather;

public interface WeatherService {
	Weather getCurrentWeather(String city) throws IOException, ParseException, JSONException, org.json.simple.parser.ParseException;
}