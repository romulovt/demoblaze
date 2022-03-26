package com.demolaze.qa.tasks;

import com.demolaze.qa.userinterface.SignUpModal;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatosSignUp implements Task {

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        String userName = actor.recall("userName");
        String password = actor.recall("password");

        actor.attemptsTo(
                Enter.theValue(userName).into(SignUpModal.INP_USERNAME),
                Enter.theValue(password).into(SignUpModal.INP_PASSWORD),
                Click.on(SignUpModal.BTN_SIGN_UP)
        );
        Switch.toAlert();
/*
        actor.attemptsTo(
                Click.on(SignUpModal.BTN_CLOSE)
        );*/
    }

    public static IngresarDatosSignUp on() {

        return instrumented(IngresarDatosSignUp.class);
    }
}
