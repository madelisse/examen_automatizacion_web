package com.nttdata.steps;

import com.nttdata.page.PopUpPage;
import org.openqa.selenium.WebDriver;

public class PopUpPageSteps {
    private WebDriver driver;
    public PopUpPageSteps(WebDriver driver){
        this.driver = driver;
    }

    public String textoConfirmacion(){
        return this.driver.findElement(PopUpPage.textConfimation).getText();
    }

    public Double expectedTotal(){
        String precioUnitario = this.driver.findElement(PopUpPage.productPrice).getText();
        String cantidad = this.driver.findElement(PopUpPage.cantidad).getText();
        Double expectedTotal = Double.parseDouble(precioUnitario.split(" ")[0].replace(',','.'))*(Double.parseDouble(cantidad));
        return expectedTotal;
    }
    public Double actualTotal(){
        String subTotal = this.driver.findElement(PopUpPage.subTotal).getText();
        //String impuestos = this.driver.findElement(PopUpPage.impuestos).getText();
        Double actualTotal = Double.parseDouble(subTotal.split(" ")[0].replace(',','.'));
        return actualTotal;
    }

    public void finalizarCompra(){
        this.driver.findElement(PopUpPage.finalizarButton).click();
    }
}
