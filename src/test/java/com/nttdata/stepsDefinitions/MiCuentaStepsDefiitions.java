package com.nttdata.stepsDefinitions;

import com.nttdata.steps.MiCuentaSteps;
import io.cucumber.java.es.Cuando;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class MiCuentaStepsDefiitions {
    private WebDriver driver;

    @Cuando("navego a la categoria Clothes y subcategoria Men")
    public  void navego_a_lac_ategoria_Clothes_y_subcategoria_Men(){
        driver = getDriver();
        MiCuentaSteps miCuentaSteps = new MiCuentaSteps(driver);
        miCuentaSteps.irClothesMen();
        screenShot();
    }
}
