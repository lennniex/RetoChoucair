package ui;

import com.gargoylesoftware.htmlunit.html.applets.AppletClassLoader;

public class DevicesForm {
    public static final Target Your_Computer = Target.the(AppletClassLoader).located(css=#web-device > .form-group:nth-child(1) .ui-select-match-text));
    public static final Target Version = Target.the(AppletClassLoader).located(css=#mobile-device > .form-group:nth-child(2) .ui-select-match > .btn);
    public static final Target Languege = Target.the(AppletClassLoader).located(css=#web-device > .form-group:nth-child(1) .ui-select-match-text));
    public static final Target  Your_Mobile_Device = Target.the(AppletClassLoader).located(css=#mobile-device > .form-group:nth-child(2) .ui-select-match > .btn);
    public static final Target Models = Target.the(AppletClassLoader).located(css=#web-device > .form-group:nth-child(1) .ui-select-match-text));
    public static final Target Operating_System = Target.the(AppletClassLoader).located(css=#mobile-device > .form-group:nth-child(2) .ui-select-match > .btn);

    public static final Target NEXT_BUTTON = Target.the("Last Step").located(css=.btn-blue > span);

}
