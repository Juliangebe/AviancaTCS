package co.com.avianca.certification.flights.stepdefinitions;

import co.com.avianca.certification.flights.models.CitiesModel;
import co.com.avianca.certification.flights.questions.TheElement;
import co.com.avianca.certification.flights.tasks.ChooseFlight;
import co.com.avianca.certification.flights.tasks.GoTo;
import co.com.avianca.certification.flights.userinterfaces.AviancaHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FlightReservationStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver driver;

    private Actor user = Actor.named("user");
    private AviancaHomePage homePage;

    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();

    }


    @Given("^That the user wants to buy a ticket$")
    public void thatTheUserWantsToBuyATicket() {
        user.wasAbleTo(GoTo.theUrl(homePage));
    }


    @When("^The user select the flight options$")
    public void theUserSelectTheFlightOptions(List<CitiesModel> citiesModel) {
        user.attemptsTo(ChooseFlight.options(citiesModel.get(0)));

    }

    @Then("^The user can see the rate selection$")
    public void theUserCanSeeTheRateSelection() {

        user.should(seeThat(TheElement.exists(AviancaHomePage.DATES_CONTAINER)));

    }
}
