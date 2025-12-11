package com.nttdata.stepsDefinitions;

import com.nttdata.steps.PopUpPageSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class PopUpStepsDefinitions {
    private WebDriver driver;

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void valido_en_el_popup_la_confirmación_del_producto_agregado(){
        driver = getDriver();
        PopUpPageSteps popUpPageSteps =  new PopUpPageSteps(driver);
        String textoConfirmacion = popUpPageSteps.textoConfirmacion();
        textoConfirmacion = textoConfirmacion.substring(1,textoConfirmacion.length());
        Assertions.assertEquals("Producto añadido correctamente a su carrito de compra",textoConfirmacion);
        screenShot();
    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void valido_en_el_popup_que_el_monto_total_sea_calculado_correctamente(){
        PopUpPageSteps popUpPageSteps = new PopUpPageSteps(driver);
        Double expectedTotal = popUpPageSteps.expectedTotal();
        Double actualTotal = popUpPageSteps.actualTotal();
        Assertions.assertEquals(expectedTotal,actualTotal);
    }

    @Cuando("finalizo la compra")
    public void finalizo_la_compra(){
        PopUpPageSteps popUpPageSteps = new PopUpPageSteps(driver);
        popUpPageSteps.finalizarCompra();
        screenShot();
    }
}
