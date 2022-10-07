package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairDivicesPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairJoinTodayPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LastStep implements Task{
    private String password;
    private String confirmPassword;

    public LastStep(String password, String confirmPassword) {

        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public static LastStep theLastStep(String password, String confirmPassword) {
        return Tasks.instrumented(LastStep.class, password, confirmPassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue(password).into(ChoucairLastStepPage.UTEST_PASSWORD),
                Enter.theValue(confirmPassword).into(ChoucairLastStepPage.CONFIRM_PASSWORD),
                Click.on(ChoucairLastStepPage.STAY_INFORMED),
                Click.on(ChoucairLastStepPage.UTEST_TERMS),
                Click.on(ChoucairLastStepPage.PRIVACY_SECURITY_POLICY),
                Click.on(ChoucairLastStepPage.BTN_COMPLETE_SETUP)
        );}
}
