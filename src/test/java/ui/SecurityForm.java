package ui;

public class SecurityForm {
    public static final Target Create_your_uTest_password = Target.the("Create your utest pasword").located(By.id("id=password"));
    public static final Target Confirm_password = Target.the("Confirm password").located(By.id("id=confirmPassword"));

    public static final Target Stay_Informed= Target.the("Stay Informed").located(By.id("css=.signup-consent__checkbox--highlight"));
    public static final Target uTest_Terms_of_Use = Target.the("uTest_Terms_of_Use").located(By.id("css=.row:nth-child(5) > .input-check-box"));
    public static final Target Privacy_&_Security_Policy = Target.the("Privacy_&_Security_Policy").located(By.id("css=.row:nth-child(6) > .input-check-box"));

    public static final Target NEXT_BUTTON = Target.the("Complete").located(By.id("id=laddaBtn"));

}
