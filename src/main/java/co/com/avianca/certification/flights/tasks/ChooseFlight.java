package co.com.avianca.certification.flights.tasks;

import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.RESERVATION_OPTIONS;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.SOLO_IDA;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.HACIA_OPTION;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.PASSENGERS_OPTIONS;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.ADULT_PLUS;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.KID_PLUS;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.BABY_PLUS;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.CONTINUE_BUTTON;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.FECHA_IDA_BUTTON;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.TODAY_DATE;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.BUSCAR_VUELO_BUTTON;
import static co.com.avianca.certification.flights.userinterfaces.AviancaHomePage.CONTINUE_BUTTON2;


import co.com.avianca.certification.flights.models.CitiesModel;
import co.com.avianca.certification.flights.userinterfaces.AviancaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import java.awt.*;

public class ChooseFlight implements Task {

    private CitiesModel citiesModel;

    public ChooseFlight(CitiesModel citiesModel){
        this.citiesModel=citiesModel;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RESERVATION_OPTIONS),
                Click.on(SOLO_IDA),
                Enter.theValue(citiesModel.getToCity()).into(HACIA_OPTION).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Click.on(PASSENGERS_OPTIONS),
                Click.on(ADULT_PLUS),
                Click.on(KID_PLUS),
                Click.on(BABY_PLUS),
                Click.on(CONTINUE_BUTTON),
                Click.on(FECHA_IDA_BUTTON),
                Click.on(TODAY_DATE),
                Click.on(BUSCAR_VUELO_BUTTON),
                Click.on(CONTINUE_BUTTON2)


        );

    }

    public static ChooseFlight options(CitiesModel citiesModel) {
        return Tasks.instrumented(ChooseFlight.class,citiesModel);
    }
}
