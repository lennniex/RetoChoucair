package tasks;

import net.serenitybdd.screenplay.actions.Enter;
import ui.AddressForm;

public class FillAddress {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Bogota").into(AddressForm.City),
                Enter.theValue("11003").into(AddressForm.Zip),
                Enter.theValue("Colombia").into(AddressForm.Contry),

        Click.on(AddressForm.NEXT_BUTTON)
        );
    }

}
