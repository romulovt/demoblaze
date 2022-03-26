package com.demolaze.qa.tasks;

import com.demolaze.qa.userinterface.DemoblazeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCategoria implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DemoblazeHome.LINK_CATEGORIA)
        );

    }

    public static SeleccionarCategoria on() {

        return instrumented(SeleccionarCategoria.class);
    }
}
