package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laptops {

    WebDriver driver;
    WebDriverWait wait;

    By clickLaptopsButton = By.xpath("(//a[@id='itemc'])[2]");
    By clickMacBookAirButton = By.xpath("(//a[@class='hrefch'])[3]");
    By clickAddToCartMacBookAirButton = By.xpath("//a[contains(@class,'btn btn-success')]");
    By clickProductStoreButton = By.id("nava");



    public Laptops(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickLaptopsButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickLaptopsButton)).click();
    }

    public void clickMacBookAirButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickMacBookAirButton)).click();
    }

    public void clickAddToCartMacBookAirButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickAddToCartMacBookAirButton)).click();
    }

    public void clickProductStoreButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickProductStoreButton)).click();
    }

}
