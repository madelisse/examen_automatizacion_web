package com.nttdata.stepsDefinitions;

import com.nttdata.page.CarritoPage;
import com.nttdata.steps.CarritoSteps;
import com.nttdata.steps.PopUpPageSteps;
import io.cucumber.java.eo.Do;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
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
    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvo_a_validar_el_calculo_de_precios_en_el_carrito(){
        CarritoSteps carritoSteps = new CarritoSteps(driver);
        Double  expectedTotal = carritoSteps.expectedTotal();
        Double actualTotal = carritoSteps.actualTotal();
        Assertions.assertEquals(expectedTotal,actualTotal);
    }
}
