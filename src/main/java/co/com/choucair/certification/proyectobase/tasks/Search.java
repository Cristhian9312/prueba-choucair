package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairJoinTodayPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Search implements Task{
    private String course;
    private String zipCode;

    public Search(String course, String zipCode) {
        this.course = course;
        this.zipCode = zipCode;
    }
    public static Search the(String course, String zipCode) {
        return Tasks.instrumented(Search.class, course, zipCode);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(course).into(ChoucairSearchPage.CITY),
                Enter.theValue(zipCode).into(ChoucairSearchPage.POSTAL_CODE),
                Scroll.to(ChoucairSearchPage.BTN_NEXT),
                Click.on(ChoucairSearchPage.COUNTRY),
                Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul/li/div[9]"),
                Click.on(ChoucairSearchPage.BTN_NEXT)
        );}
}








