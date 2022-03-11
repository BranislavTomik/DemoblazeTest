package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Monitors {

    WebDriver driver;
    WebDriverWait wait;

    By clickMonitorsButton = By.xpath("(//a[@id='itemc'])[3]");
    By clickAppleMonitor24Button = By.xpath("(//img[@class='card-img-top img-fluid'])[1]");
    By clickAddToCartAppleMonitor24Button = By.xpath("//a[contains(@class,'btn btn-success')]");


    public Monitors(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickMonitorsButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickMonitorsButton)).click();
    }

    public void clickAppleMonitor24Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickAppleMonitor24Button)).click();
    }

    public void clickAddToCartAppleMonitor24Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickAddToCartAppleMonitor24Button)).click();
    }
}
