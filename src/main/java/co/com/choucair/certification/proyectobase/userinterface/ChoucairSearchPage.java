package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairSearchPage extends PageObject{

    public static final Target CITY = Target.the("text's box to enter the city")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("text's box to enter the postal code")
            .located(By.id("zip"));
    public static final Target COUNTRY = Target.the("text's box to enter the country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target BTN_NEXT = Target.the("Button for turn the divices page")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
