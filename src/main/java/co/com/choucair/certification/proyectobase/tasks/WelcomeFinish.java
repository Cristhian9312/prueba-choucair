package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairWelcomeFinishPage;
import net.serenitybdd.screenplay.Performable;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairDivicesPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairJoinTodayPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class WelcomeFinish implements Task{
    private String course;

    public WelcomeFinish(String course) {
        this.course = course;
    }

    public static WelcomeFinish welcome(String course) {
        return Tasks.instrumented(WelcomeFinish.class, course);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairWelcomeFinishPage.NAME_CURSE)
        );}
}
