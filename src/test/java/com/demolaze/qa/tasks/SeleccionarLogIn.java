package com.demolaze.qa.tasks;

import com.demolaze.qa.userinterface.DemoblazeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarLogIn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoblazeHome.LINK_LOG_IN)
        );
    }

    public static SeleccionarLogIn on() {

        return instrumented(SeleccionarLogIn.class);
    }
}
