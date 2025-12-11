package com.nttdata.stepsDefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginStepsDefinitions {
    private WebDriver driver;


    @Dado("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda(){
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        screenShot();
    }
    @Y("me logueo con mi email \"{word}\" y password \"{word}\"")
    public void me_logueo_con_mi_email_y_password(String email,String password){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.irLogin();
        loginSteps.escribirEmail(email);
        loginSteps.escribirPassword(password);
        loginSteps.login();
        screenShot();

    }
}
