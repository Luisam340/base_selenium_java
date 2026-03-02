package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import questions.LoginResult;
import tasks.Login;

import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    Actor user = Actor.named("QA User");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(
                net.serenitybdd.core.Serenity.getDriver()
        ));
    }

    @Given("que el usuario está en la página de login")
    public void openLoginPage() {
        user.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    @When("ingresa credenciales válidas")
    public void login() {
        user.attemptsTo(
                Login.withCredentials("standard_user", "secret_sauce")
        );
    }

    @Then("debería ver la pantalla de productos")
    public void validateLogin() {
        user.should(
                seeThat(LoginResult.displayed(), equalTo("Products"))
        );
    }
}