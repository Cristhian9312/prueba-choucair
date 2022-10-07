package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJoinTodayPage extends PageObject{
    public static final Target LOGIN_BUTTON = Target.the("button that takes us to the first form")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up'][contains(.,'Join Today')]"));
    public static final Target FIRST_NAME = Target.the("text's box to enter the name")
            .located(By.xpath("//*[@id='firstName']"));
    public static final Target LAST_NAME = Target.the("text's box to enter the last name")
            .located(By.xpath("//input[contains(@id,'lastName')]"));
    public static final Target EMAIL_ADDRESS = Target.the("text's box to enter the email address")
            .located(By.xpath("//*[@id='email']"));
    public static final Target MOUNTH_OF_BIRTH = Target.the("text's box to enter the mounth of birth")
            .located(By.xpath("//select[contains(@id,'birthMonth')]"));
    public static final Target DAY_OF_BIRTH = Target.the("text's box to enter the day of birth")
            .located(By.xpath("//select[contains(@id,'birthDay')]"));
    public static final Target YEAR_OF_BIRTH = Target.the("text's box to enter the year of birth")
            .located(By.xpath("//select[contains(@id,'birthYear')]"));
    public static final Target LANGUAGES = Target.the("text's box to enter the languages")
            .located(By.xpath("//*[@id='languages']/div[1]"));
    public static final Target BTN_NEXT = Target.the("Button for turn the page")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
