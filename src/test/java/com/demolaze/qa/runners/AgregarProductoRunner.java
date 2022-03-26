package com.demolaze.qa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\agregar_producto.feature",
        glue = "com\\demolaze\\qa\\stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AgregarProductoRunner {
}
