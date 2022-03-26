package com.demolaze.qa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInModal extends PageObject {

    public static final Target INP_USERNAME = Target.the("Nombre de Usuario").located(By.id("loginusername"));
    public static final Target INP_PASSWORD = Target.the("Password").located(By.id("loginpassword"));
    public static final Target BTN_LOG_IN = Target.the("Boton Log In").located(By.xpath("//*[@type='button' and contains(text(),'Log in')]"));

}
