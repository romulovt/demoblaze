package com.demolaze.qa.stepsdefinitions;

import com.demolaze.qa.questions.AlertSuccessful;
import com.demolaze.qa.questions.ProductoInCart;
import com.demolaze.qa.tasks.*;
import com.demolaze.qa.userinterface.DemoblazeHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AltaUsuarioStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    private Actor usuario = Actor.named("usuario");

    @Given("que el usuario web ingresa a Demoblaze")
    public void queElUsuarioWebIngresaADemolaze() {
        usuario.can(BrowseTheWeb.with(navegador));
        usuario.wasAbleTo(AbrirNavegador.on());
    }

    @Given("da de alta una cuenta ingresando el {string} y el {string}")
    public void daDeAltaUnaCuentaIngresandoElYEl(String userName, String password) {
        usuario.wasAbleTo(SeleccionarSignUp.on());

        usuario.remember("userName",userName);
        usuario.remember("password",password);
        usuario.wasAbleTo(IngresarDatosSignUp.on());
        //System.out.println("respuesta: "+ AlertSuccessful.value().answeredBy(usuario));
    }
    @Given("el usuario web se loguea")
    public void elUsuarioWebSeLoguea() {
        usuario.wasAbleTo(SeleccionarLogIn.on());
        usuario.wasAbleTo(LogIn.on());
    }
    @When("selecciona la categoria Laptops")
    public void seleccionaLaCategoriaLaptops() {
        usuario.wasAbleTo(SeleccionarCategoria.on());
    }
    @When("el agrega una laptop al carrito")
    public void elAgregaUnaLaptopAlCarrito() {
        usuario.wasAbleTo(AgregarProductoAlCarrito.on());
    }
    @Then("se muestra la laptop en la opcion cart")
    public void seMuestraLaLaptopEnLaOpcionCart() {
        usuario.wasAbleTo(SeleccionarCart.on());
        System.out.println("Nombre del producto en el carro: "+ ProductoInCart.value().answeredBy(usuario));
    }
    @Then("el usuario cierra sesion")
    public void elUsuarioCierraSesion() {
        usuario.wasAbleTo(LogOut.on());
    }

}
