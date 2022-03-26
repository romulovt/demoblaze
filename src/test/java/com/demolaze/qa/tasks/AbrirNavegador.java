package com.demolaze.qa.tasks;

import com.demolaze.qa.userinterface.DemoblazeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(new DemoblazeHome()));
    }

    public static AbrirNavegador on() {

        return instrumented(AbrirNavegador.class);
    }
}
