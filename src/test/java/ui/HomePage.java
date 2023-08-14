package ui;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://utest.com/")
public class HomePage  extends PageObject{

    public static final Target NEXT_BUTTON = Target.thexpath=//a[contains(text(),'Join Today')];
}
