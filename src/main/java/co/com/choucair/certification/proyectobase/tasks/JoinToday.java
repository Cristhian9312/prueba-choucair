package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairJoinTodayPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Random;

public class JoinToday implements Task {
    private String strUser;
    private String strPassword;

    public JoinToday(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Performable onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(JoinToday.class,strUser,strPassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairJoinTodayPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairJoinTodayPage.FIRST_NAME),
                Enter.theValue(strPassword).into(ChoucairJoinTodayPage.LAST_NAME),
                Enter.theValue("agonTargueran_stark" + new Random().nextInt(999999) + "@winterfell5.com").into(ChoucairJoinTodayPage.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText("December").from(ChoucairJoinTodayPage.MOUNTH_OF_BIRTH),
                SelectFromOptions.byVisibleText("22").from(ChoucairJoinTodayPage.DAY_OF_BIRTH),
                SelectFromOptions.byIndex(4).from(ChoucairJoinTodayPage.YEAR_OF_BIRTH),
                Scroll.to(ChoucairJoinTodayPage.BTN_NEXT),
                Click.on(ChoucairJoinTodayPage.LANGUAGES),
                Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/ul/li/div[38]"),
                Click.on(ChoucairJoinTodayPage.BTN_NEXT)
        );
    }
}
