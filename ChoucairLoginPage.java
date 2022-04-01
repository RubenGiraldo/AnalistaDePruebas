package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that show us the from to login")
            .located(By.xpath("div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target USER = Target.the("where do we write the user")
            .located(By.name("username"));
    public static final Target PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target ACCESS_BUTTON = Target.the("button to confirm login")
            .located(By.xpath("//button[contains(@class,'btn btn_primary')]"));

}
