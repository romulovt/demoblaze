package com.demolaze.qa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpModal extends PageObject {

    public static final Target INP_USERNAME = Target.the("Nombre de Usuario").located(By.id("sign-username"));
    public static final Target INP_PASSWORD = Target.the("Password").located(By.id("sign-password"));
    public static final Target BTN_SIGN_UP = Target.the("Boton Sign Up").located(By.xpath("//*[@type='button' and contains(text(),'Sign up')]"));
    public static final Target BTN_CLOSE = Target.the("Boton Close").located(By.xpath("//*[@type='button' and contains(text(),'Close')]"));


}
