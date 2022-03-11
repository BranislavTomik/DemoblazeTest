package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phones {

    WebDriver driver;
    WebDriverWait wait;

    By clickPhonesButton = By.xpath("(//a[@id='itemc'])[1]");
    By clickIphone6Button = By.xpath("(//img[@class='card-img-top img-fluid'])[5]");
    By clickAddToCartIphone6Button = By.xpath("//a[contains(@class,'btn btn-success')]");
    By clickProductStoreButton = By.id("nava");


    public Phones(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickPhonesButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickPhonesButton)).click();
    }

    public void clickIphone6Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickIphone6Button)).click();
    }

    public void clickAddToCartIphone6Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickAddToCartIphone6Button)).click();
    }

    public void clickProductStoreButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickProductStoreButton)).click();
    }


}
