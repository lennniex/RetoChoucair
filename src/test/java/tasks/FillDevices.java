package tasks;

import net.serenitybdd.screenplay.actions.Enter;
import ui.AddressForm;
import ui.DevicesForm;

public class FillDevices {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Wimdwos").into(DevicesForm.Your_Computer),
                Enter.theValue("Wimdwos 10").into(DevicesForm.Version),
                Enter.theValue("Apple").into(DevicesForm.Your_Mobile_Device),
                Enter.theValue("iPhone XR").into(DevicesForm.Models),
                Enter.theValue("iOS 12.4").into(DevicesForm.Operating_System),

                Click.on(DevicesForm.NEXT_BUTTON)
        );
    }

}