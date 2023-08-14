package stepdefinitions;

import cucumber.api.java.es.Given;
import cucumber.api.java.es.When;
import cucumber.api.java.es.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import ui.HomePage;

import java.util.list;
public class RegisterSteps {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Reto");
    private HomePage  homePage = new HomePage();


    @Given("^que Lennin quiere registrarse en uTest$")
    public void queLenninQuiereRegistrarseEnUTest() {
      actor.can(BrowseTheWeb.with(navegador));
      actor.wasAbleTo(Open.browserOn(homePage));
      actor.wasAbleTo(
              HomePage.conDescription(homePage)
      );
    }
    @When("^el completa el formulario de información personal$")
    public void elCompletaElFormularioDeInformacionPersonal() {
        theActorInTheSpotlight().attemptsTo(FillPersonalInformation.withData());
    }

    @And("^el completa el formulario de dirección$")
        public void elCompletaElFormularioDeDirección() {
            theActorInTheSpotlight().attemptsTo(FillPersonalInformation.withData());
    }
    @And("^el completa el formulario de dispositivos$")
    public void elCompletaElFormularioDeDispositivos() {
        theActorInTheSpotlight().attemptsTo(FillPersonalInformation.withData());
    }
    @And ("^el completa el formulario de seguridad$")
    public void elCompletaElFormularioDeSegurida() {
        theActorInTheSpotlight().attemptsTo(FillPersonalInformation.withData());
    }
    @Then ("^Lennin debe ver que se ha completado el registro$")
    public void LenninDebeVerQueSeHaCompletadoElRegistro() {
        theActorInTheSpotlight().attemptsTo(FillPersonalInformation.withData());
    }

}
