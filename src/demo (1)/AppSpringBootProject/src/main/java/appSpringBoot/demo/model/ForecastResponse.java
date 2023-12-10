package appSpringBoot.demo.model;

public class ForecastResponse {
    private MeteoCityInfo city;
    private String update;
    private MeteoDailyForecast forecast;

    public MeteoCityInfo getCity() {
        return city;
    }

    public String getUpdate() {
        return update;
    }

    public MeteoDailyForecast getForecast() {
        return forecast;
    }

    public void setCity(MeteoCityInfo city) {
        this.city = city;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public void setForecast(MeteoDailyForecast forecast) {
        this.forecast = forecast;
    }
}
