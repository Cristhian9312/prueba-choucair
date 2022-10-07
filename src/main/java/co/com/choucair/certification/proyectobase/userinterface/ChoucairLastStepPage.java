package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLastStepPage extends PageObject{

    public static final Target UTEST_PASSWORD = Target.the("Text's box for write the uTest password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Text's box for confirm the uTest password")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("safe check box")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target UTEST_TERMS = Target.the("safe check box of terms and conditions")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_SECURITY_POLICY = Target.the("safe check box of terms and conditions")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BTN_COMPLETE_SETUP = Target.the("Button for turn the complete setup page")
            .located(By.id("laddaBtn"));

}
