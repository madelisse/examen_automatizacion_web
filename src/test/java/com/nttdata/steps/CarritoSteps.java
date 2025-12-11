package com.nttdata.steps;

import com.nttdata.page.CarritoPage;
import com.nttdata.page.PopUpPage;
import org.openqa.selenium.WebDriver;

public class CarritoSteps {
    private WebDriver driver;
    public CarritoSteps(WebDriver driver){
        this.driver = driver;
    }

    public String tituloPagina(){
        return this.driver.findElement(CarritoPage.titulo).getText();
    }
    public Double  expectedTotal(){
        String precioUnitario = this.driver.findElement(CarritoPage.productPrice).getText();
        String cantidad = this.driver.findElement(CarritoPage.cantidad).getAttribute("value");
        Double expectedTotal = Double.parseDouble(precioUnitario.split(" ")[0].replace(',','.'))*(Double.parseDouble(cantidad));
        return expectedTotal;
    }
    public Double actualTotal(){
        String subTotal = this.driver.findElement(CarritoPage.subTotal).getText();
        //String impuestos = this.driver.findElement(PopUpPage.impuestos).getText();
        Double actualTotal = Double.parseDouble(subTotal.split(" ")[0].replace(',','.'));
        return actualTotal;
    }
}
