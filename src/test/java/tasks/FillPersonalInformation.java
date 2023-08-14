package tasks;

import net.serenitybdd.screenplay.actions.Enter;

public class FillPersonalInformation {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Lennin").into(PersonalInformationForm.FIRST_NAME),
                Enter.theValue("Martinez").into(PersonalInformationForm.LAST_NAME),
                Enter.theValue("Lenninlex@gmai.com").into(PersonalInformationForm.LAST_NAME),
                Enter.theValue("January").into(id=birthMonth),
                Enter.theValue("18").into(id=birthDay),
                Enter.theValue("1982").into(id=birthYear),
                Enter.theValue("English").into(css=.ui-select-match-item > span:nth-child(2)),
                Click.on(PersonalInformationForm.NEXT_BUTTON)
        );
    }
}
