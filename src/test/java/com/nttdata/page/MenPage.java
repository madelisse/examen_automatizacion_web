package com.nttdata.page;

import org.openqa.selenium.By;

public class MenPage {
    public static By pimerProducto = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");
    public static By cantidadInput = By.id("quantity_wanted");
    public static By upButton = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]");
    public static By addToCarButton = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
}
