package com.nttdata.page;

import org.openqa.selenium.By;

public class CarritoPage {
    public static By titulo  = By.cssSelector("h1.h1");
    public static By productPrice = By.cssSelector("span.price");
    public static By subTotal = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[1]/div[2]/div[2]/span[2]");
    public static By cantidad = By.xpath("/html/body/main/section/div/div/div/section/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[2]/div/div[1]/div/input");
}
