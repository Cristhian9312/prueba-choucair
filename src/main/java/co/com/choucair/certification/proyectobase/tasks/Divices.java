package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairDivicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
public class Divices implements Task {
    private String course;

    public Divices(String course) {
        this.course = course;
    }

    public static Divices theDivices(String course) {
        return Tasks.instrumented(Divices.class, course);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(ChoucairDivicesPage.YOU_COMPUTER),
            Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[4]"),
            Click.on(ChoucairDivicesPage.VERSION),
            Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[8]"),
            Click.on(ChoucairDivicesPage.LANGUAGE),
            Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[13]"),
            Click.on(ChoucairDivicesPage.MOVILE_DEVICE),
            Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[5]"),
            Click.on(ChoucairDivicesPage.MODEL),
            Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[11]"),
            Click.on(ChoucairDivicesPage.OPERATION_SYSTEM),
            Click.on("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[7]"),
            Click.on(ChoucairDivicesPage.BTN_NEXT)
    );}
}








