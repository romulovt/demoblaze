package com.demolaze.qa.questions;

import com.demolaze.qa.tasks.IngresarDatosSignUp;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlertSuccessful implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        String respuesta = Switch.toAlert().toString();

        return respuesta;
    }

    public static AlertSuccessful value(){
        return new AlertSuccessful();
    }
}
