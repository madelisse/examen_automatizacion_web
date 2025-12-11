package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {
    public static By linkLogin = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a");
    public static By emailInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");

}
