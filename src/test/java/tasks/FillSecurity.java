package tasks;

import net.serenitybdd.screenplay.actions.Enter;
import ui.AddressForm;
import ui.DevicesForm;
import ui.SecurityForm;

public class FillSecurity {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("RetoChoucair").into(SecurityForm.Create_your_uTest_password),
                Enter.theValue("RetoChoucair").into(SecurityForm.Confirm_password),
                Enter.theValue("clic").into(SecurityForm.Stay_Informed),
                Enter.theValue("clic").into(SecurityForm.uTest_Terms_of_Use),
                Enter.theValue("clic").into(SecurityForm.Privacy_),

                Click.on(SecurityForm.NEXT_BUTTON)
        );
    }
}