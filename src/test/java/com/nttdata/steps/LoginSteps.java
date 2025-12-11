package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {
    private WebDriver driver;
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    public void irLogin(){
        this.driver.findElement(LoginPage.linkLogin).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));
    }
    public void escribirEmail(String email){
        WebElement userInputElement = driver.findElement(LoginPage.emailInput);
        userInputElement.sendKeys(email);
    }
    public void escribirPassword(String pass){
        WebElement passwordInputElement = driver.findElement(LoginPage.passInput);
        passwordInputElement.sendKeys(pass);
    }
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }
}
