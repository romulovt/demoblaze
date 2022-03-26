package com.demolaze.qa.tasks;

import com.demolaze.qa.userinterface.DemoblazeHome;
import com.demolaze.qa.userinterface.DetalleProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductoAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoblazeHome.LINK_MACBOOK_AIR),
                Click.on(DetalleProducto.LINK_ADD_TO_CART)
        );
        Switch.toAlert();
    }

    public static AgregarProductoAlCarrito on() {

        return instrumented(AgregarProductoAlCarrito.class);
    }
}
