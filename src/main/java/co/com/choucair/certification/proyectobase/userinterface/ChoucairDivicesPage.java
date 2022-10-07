package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairDivicesPage extends PageObject{
    public static final Target YOU_COMPUTER = Target.the("menu for select a computer")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]"));
    public static final Target VERSION = Target.the("menu for select a version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]"));
    public static final Target LANGUAGE = Target.the("menu for select a language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]"));
    public static final Target MOVILE_DEVICE = Target.the("menu for select a movile device")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]"));
    public static final Target MODEL = Target.the("menu for select a model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]"));
    public static final Target OPERATION_SYSTEM = Target.the("menu for select a operation system")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]"));
    public static final Target BTN_NEXT = Target.the("Button for turn the last step page")
            .located(By.xpath("//span[contains(.,'Next: Last Step')]"));
}
