package ui;

public class AddressForm {
    public static final Target City = Target.the("City").located(By.id("id=city"));
    public static final Target Zip = Target.the("Zip").located(By.id("id=zip"));
    public static final Target Contry = Target.the("Contry).located(By.id("css=.ui-select-highlight"));

    public static final Target NEXT_BUTTON = Target.the("Next devices").located(By.id("Next Device"));

}
