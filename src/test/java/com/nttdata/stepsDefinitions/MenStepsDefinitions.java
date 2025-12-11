package com.nttdata.stepsDefinitions;

import com.nttdata.steps.MenSteps;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class MenStepsDefinitions {
    private WebDriver driver;

    @Y("agrego \"{int}\" unidades del primer producto al carrito")
    public void agrego_2_unidades_del_primer_producto_al_carrito(int cantidad){
        driver = getDriver();
        MenSteps menSteps = new MenSteps(driver);
        menSteps.seleccionarProducto();
        menSteps.ingresarCantidad(cantidad);
        menSteps.addToCar();
        screenShot();
    }
}
