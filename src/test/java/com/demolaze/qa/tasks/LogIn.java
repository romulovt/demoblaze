package com.demolaze.qa.tasks;

import com.demolaze.qa.userinterface.LogInModal;
import com.demolaze.qa.userinterface.SignUpModal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String userName = actor.recall("userName");
        String password = actor.recall("password");

        actor.attemptsTo(
                Enter.theValue(userName).into(LogInModal.INP_USERNAME),
                Enter.theValue(password).into(LogInModal.INP_PASSWORD),
                Click.on(LogInModal.BTN_LOG_IN)
        );

    }

    public static LogIn on(){
        return instrumented(LogIn.class);
    }
}
