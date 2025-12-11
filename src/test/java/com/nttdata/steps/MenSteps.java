package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import com.nttdata.page.MenPage;
import com.nttdata.page.PopUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MenSteps {
    private WebDriver driver;
    public MenSteps(WebDriver driver){
        this.driver = driver;
    }

    public void seleccionarProducto(){
        WebElement primerProducto = driver.findElement(MenPage.pimerProducto);
        primerProducto.click();
    }
    public void ingresarCantidad(int cantidad){
        /*WebElement cantidadInput = driver.findElement(MenPage.cantidadInput);
        cantidadInput.sendKeys(Integer.toString(cantidad));*/
        for (int i = 1; i <cantidad ; i++) {
            this.driver.findElement(MenPage.upButton).click();
        }
    }
    public void addToCar(){
        this.driver.findElement(MenPage.addToCarButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PopUpPage.finalizarButton));
    }
}
