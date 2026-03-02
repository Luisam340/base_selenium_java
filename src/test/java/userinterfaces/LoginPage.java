
package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target USERNAME = Target.the("Username field")
            .located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("Password field")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.id("login-button"));

    public static final Target PRODUCTS_TITLE = Target.the("Products title")
            .located(By.className("title"));
}
