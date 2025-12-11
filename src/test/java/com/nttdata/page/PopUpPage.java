package com.nttdata.page;

import org.openqa.selenium.By;

public class PopUpPage {
    public static By textConfimation = By.id("myModalLabel");
    public static By productPrice = By.cssSelector("p.product-price");
    public static By subTotal = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[2]/span[2]");
    public static By cantidad = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/span[3]/strong");
    public static By impuestos = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[5]/span");
    public static By finalizarButton = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
}
