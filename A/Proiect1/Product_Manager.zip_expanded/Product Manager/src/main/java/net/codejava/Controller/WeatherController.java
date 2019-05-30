package net.codejava.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.aksingh.owmjapis.AbstractWeather.Weather;
import net.codejava.View.WeatherService;
import org.json.JSONException;
import java.io.IOException;
import java.text.ParseException;

@RestController
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping(value = "/weather")
    public net.codejava.Model.Weather currentWeather() throws IOException, ParseException, JSONException, org.json.simple.parser.ParseException {
    	return weatherService.getCurrentWeather("Cluj-Napoca");
    }
}
