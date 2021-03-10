package co.com.avianca.certification.flights.tasks;


import co.com.avianca.certification.flights.userinterfaces.AviancaHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class GoTo implements Task {

    private PageObject page;

    public GoTo(PageObject page){
        this.page= page;

    }


    @Override
    @Step("{0} Open the Avianca home page ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new AviancaHomePage()));

    }

    public static GoTo theUrl(PageObject page) {

        return instrumented(GoTo.class,page);
    }
}
