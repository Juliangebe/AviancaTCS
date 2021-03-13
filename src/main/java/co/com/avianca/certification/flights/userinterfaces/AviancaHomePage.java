package co.com.avianca.certification.flights.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.avianca.com/co/es/")
public class AviancaHomePage extends PageObject {

    public static final Target RESERVATION_OPTIONS = Target.the("Reservation option").located(By.id("reservatuvuelo"));
    public static final Target SOLO_IDA = Target.the("Solo ida reservation option").located(By.xpath("//*[normalize-space(text()) = 'Solo ida']"));
    public static final Target HACIA_OPTION = Target.the("Hacia option").located(By.xpath("//div[@class='col-xs-12 col-sm-6 city-paddingNoMulti']//div/input[@data-group='.airport_regreso']"));
    public static final Target PASSENGERS_OPTIONS = Target.the("Reservation option").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]"));
    public static final Target FECHA_IDA_BUTTON = Target.the("Departure date").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/label[1]/div[1]/input[1]"));
    public static final Target TODAY_DATE = Target.the("today date").located(By.xpath("//div[@data-space='ida']/table/tbody/tr/td[@class='cal1']/div[@class='number-days']/table/tbody//tr/td/div[@class='intern-day']"));
    public static final Target ADULT_PLUS = Target.the("Adults").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/i[1]"));
    public static final Target KID_PLUS = Target.the("kids").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/i[1]"));
    public static final Target BABY_PLUS = Target.the("babies").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/i[1]"));
    public static final Target CONTINUE_BUTTON = Target.the("continue button").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/button[1]"));
    public static final Target BUSCAR_VUELO_BUTTON = Target.the("Choose flight button").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[4]/button[1]"));
    public static final Target CONTINUE_BUTTON2 = Target.the("continue button").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/button[1]"));
    public static final Target DATES_CONTAINER = Target.the("dates options").located(By.id("dates-container"));


}
