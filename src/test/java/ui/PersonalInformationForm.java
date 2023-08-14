package ui;

import net.serenitybdd.screenplay.Task;

public class PersonalInformationForm implements Task {
    public static final Target FIRST_NAME = Target.the("First name").located(By.id("id=firstName"));
    public static final Target LAST_NAME = Target.the("Last name").located(By.id("id=firstName"));
    public static final Target EMAIL_ADDRESS = Target.the("Email address").located(By.id("id=email"));
    public static final Target DATE_OF_BIRTH = Target.the("Month").located(By.id("id=birthMonth"));
    public static final Target DATE_OF_BIRTH = Target.the("Day").located(By.id("id=birthDay"));
    public static final Target DATE_OF_BIRTH = Target.the("Year").located(By.id("id=birthYear"));
    public static final Target LANGUAGES = Target.the("Languages").located(By.id("languagesInputId"));
    public static final Target NEXT_BUTTON = Target.the("Next Location").located(By.id("css=.material-icons:nth-child(2)"));
}
