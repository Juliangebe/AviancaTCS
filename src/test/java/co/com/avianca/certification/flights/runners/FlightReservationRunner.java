package co.com.avianca.certification.flights.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/flight_reservation.feature",
        glue = "co.com.avianca.certification.flights.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class FlightReservationRunner {
}
