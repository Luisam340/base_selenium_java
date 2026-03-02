
package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.LoginPage;

public class LoginResult implements Question<String> {

    public static LoginResult displayed() {
        return new LoginResult();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.PRODUCTS_TITLE).answeredBy(actor);
    }
}
