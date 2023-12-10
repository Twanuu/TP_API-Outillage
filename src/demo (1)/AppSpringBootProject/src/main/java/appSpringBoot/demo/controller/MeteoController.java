package appSpringBoot.demo.controller;

import appSpringBoot.demo.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {

    @PostMapping("/meteo")
    public String postForm(@RequestParam("address") String address, Model model){
        Coordinates coordinates = getCoordinatesFromAddress(address);
        model.addAttribute("address", address);
        model.addAttribute("coordinates", coordinates);
        if (coordinates != null) {
            ForecastResponse forecast = getWeatherForecast(coordinates);
            model.addAttribute("forecast", forecast);
        }
        return "meteo";
    }
    @GetMapping("/meteo")
    public String showMeteo(Model model) {

        return "meteo";
    }

    private Coordinates getCoordinatesFromAddress(String address) {
        String apiUrl = "https://api-adresse.data.gouv.fr/search/?q={address}&limit=1";
        RestTemplate restTemplate = new RestTemplate();
        AddressResponse addressResponse = restTemplate.getForObject(apiUrl, AddressResponse.class, address);

        if (addressResponse != null && !addressResponse.getFeatures().isEmpty()) {
            Geometry geometry = addressResponse.getFeatures().get(0).getGeometry();
            return new Coordinates(geometry.getCoordinates().get(0), geometry.getCoordinates().get(1));
        } else {
            return null;
        }
    }

    private ForecastResponse getWeatherForecast(Coordinates coordinates) {
        String apiUrl = "https://api.meteo-concept.com/api/forecast/daily/0?token=5038390204b696551a9d93d5570bcebe3cf886001358df57f281701344cb39d5&latlng={lat},{lng}";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, ForecastResponse.class, coordinates.getLatitude(), coordinates.getLongitude());
    }

}
