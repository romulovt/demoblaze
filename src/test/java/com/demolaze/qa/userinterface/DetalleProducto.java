package com.demolaze.qa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleProducto extends PageObject {

    public static final Target LINK_ADD_TO_CART= Target.the("Link Add to cart").located(By.linkText("Add to cart"));
}
