package co.com.avianca.certification.flights.models;

public class CitiesModel {

    private String fromCity;
    private String toCity;

    public CitiesModel(String fromCity, String toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }
}
