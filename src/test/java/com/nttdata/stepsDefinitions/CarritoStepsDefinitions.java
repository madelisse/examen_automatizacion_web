package com.nttdata.stepsDefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;

public class CarritoStepsDefinitions {
    private WebDriver driver;

    @Entonces("valido el titulo de la pagina del carrito")
    public void valido_el_titulo_de_la_pagina_del_carrito(){
        driver = getDriver();
        CarritoSteps carritoSteps = new CarritoSteps(driver);
        String tituloActual = carritoSteps.tituloPagina();
        Assertions.assertEquals("CARRITO",tituloActual);
    }
}
