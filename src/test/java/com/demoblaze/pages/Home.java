package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

    WebDriver driver;
    WebDriverWait wait;

    By clickLogInButton = By.xpath("//*[@id=\"login2\"]");
    By firstName = By.id("loginusername");
    By password = By.id("loginpassword");
    By clickLogInButton2 = By.xpath("(//button[@class='btn btn-primary'])[3]");


    public Home(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickLogInButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickLogInButton)).click();
    }


    public void firstName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Branislav");
    }


    public void password() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("1234567890");
    }

    public void clickLogInButton2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickLogInButton2)).click();
    }


}

