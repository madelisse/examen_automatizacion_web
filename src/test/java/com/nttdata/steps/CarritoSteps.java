package com.nttdata.steps;

import com.nttdata.page.CarritoPage;
import org.openqa.selenium.WebDriver;

public class CarritoSteps {
    private WebDriver driver;
    public CarritoSteps(WebDriver driver){
        this.driver = driver;
    }

    public String tituloPagina(){
        return this.driver.findElement(CarritoPage.titulo).getText();
    }
}
