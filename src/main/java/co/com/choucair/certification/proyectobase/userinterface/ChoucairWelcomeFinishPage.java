package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairWelcomeFinishPage extends PageObject{

    public static final Target NAME_CURSE = Target.the("This is the text that says Welcome to the world's largest community of freelance software testers!")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));
}
