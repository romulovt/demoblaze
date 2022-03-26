package com.demolaze.qa.tasks;

import com.demolaze.qa.userinterface.DemoblazeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarSignUp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoblazeHome.LINK_SIGN_UP)
        );
    }

    public static SeleccionarSignUp on() {

        return instrumented(SeleccionarSignUp.class);
    }
}
