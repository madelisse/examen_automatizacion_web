package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import com.nttdata.page.MiCuentaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MiCuentaSteps {
    private WebDriver driver;
    public MiCuentaSteps(WebDriver driver){
        this.driver = driver;
    }

    public void irClothesMen(){
        this.driver.findElement(MiCuentaPage.clothesSpan).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MiCuentaPage.men));
        this.driver.findElement(MiCuentaPage.men).click();
    }
}
