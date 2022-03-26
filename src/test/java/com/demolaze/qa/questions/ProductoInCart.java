package com.demolaze.qa.questions;

import com.demolaze.qa.userinterface.CardProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ProductoInCart implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(CardProducts.PRODUCT_TITLE).getText();
    }
    public static ProductoInCart value(){

        return new ProductoInCart();
    }
}
