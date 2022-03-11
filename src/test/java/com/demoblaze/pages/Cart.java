package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

    WebDriver driver;
    WebDriverWait wait;


    By clickCartButton = By.xpath("(//a[@class='nav-link'])[4]");
    By clickDeleteItemButton = By.xpath("//tbody[@id='tbodyid']/tr[1]/td[4]/a[1]");
    By clickPlaceOrderButton = By.xpath("//button[@data-target='#orderModal']");
    By nameField = By.id("name");
    By countryField = By.id("country");
    By cityField = By.id("city");
    By creditCardField = By.id("card");
    By monthField = By.id("month");
    By yearField = By.id("year");
    By clickPurchaseButton = By.xpath("//button[text()='Purchase']");


    public Cart(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public void clickCartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCartButton)).click();
    }

    public void clickDeleteItemButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickDeleteItemButton)).click();
    }

    public void clickPlaceOrderButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickPlaceOrderButton)).click();
    }

    public void nameField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys("Branislav");
    }

    public void countryField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryField)).sendKeys("Macedonia");
    }

    public void cityField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityField)).sendKeys("Skopje");
    }

    public void creditCardField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(creditCardField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(creditCardField)).sendKeys("1234567");
    }

    public void monthField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(monthField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(monthField)).sendKeys("12");
    }

    public void yearField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(yearField)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(yearField)).sendKeys("22");
    }


    public void clickPurchaseButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickPurchaseButton)).click();
    }

}
