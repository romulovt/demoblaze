package com.demolaze.qa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class DemoblazeHome extends PageObject {

    public static final Target LINK_SIGN_UP = Target.the("Link Sign Up").located(By.id("signin2"));
    public static final Target LINK_LOG_IN = Target.the("Link Log In").located(By.id("login2"));
    public static final Target LINK_CATEGORIA = Target.the("Link Categoria").located(By.linkText("Laptops"));
    public static final Target LINK_MACBOOK_AIR= Target.the("Link MacBook air").located(By.linkText("MacBook air"));
    public static final Target LINK_CART = Target.the("Link Cart").located(By.linkText("Cart"));
    public static final Target LINK_LOG_OUT = Target.the("Link Log OUT").located(By.id("logout2"));
}
