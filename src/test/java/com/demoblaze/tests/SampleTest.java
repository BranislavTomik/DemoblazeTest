package com.demoblaze.tests;

import org.testng.annotations.Test;


public class SampleTest extends BaseTest {


    public void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void logInUser() {
        home.clickLogInButton();
        home.firstName();
        home.password();
        home.clickLogInButton2();

    }

    @Test
    public void AddDeleteBuyItemsFromCart() {

        phones.clickPhonesButton();
        phones.clickIphone6Button();
        phones.clickAddToCartIphone6Button();
        pause();
        driver.switchTo().alert().accept();
        phones.clickProductStoreButton();
        laptops.clickLaptopsButton();
        laptops.clickMacBookAirButton();
        laptops.clickAddToCartMacBookAirButton();
        pause();
        driver.switchTo().alert().accept();
        laptops.clickProductStoreButton();
        monitors.clickMonitorsButton();
        monitors.clickAppleMonitor24Button();
        monitors.clickAddToCartAppleMonitor24Button();
        pause();
        driver.switchTo().alert().accept();
        cart.clickCartButton();
        cart.clickDeleteItemButton();
        pause();
        cart.clickPlaceOrderButton();
        cart.nameField();
        cart.countryField();
        cart.cityField();
        cart.creditCardField();
        cart.monthField();
        cart.yearField();
        cart.clickPurchaseButton();

    }


}
