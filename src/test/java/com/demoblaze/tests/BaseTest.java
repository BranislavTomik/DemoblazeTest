package com.demoblaze.tests;

import com.demoblaze.framework.Browser;
import com.demoblaze.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    public String brs = "chrome";
    public WebDriverWait wait;
    public Cart cart;
    public Home home;
    public Laptops laptops;
    public Monitors monitors;
    public Phones phones;


    public static final String URL = "https://www.demoblaze.com/";


    Browser browser = new Browser();

    @BeforeMethod
    public void setUp() {
        driver = browser.open(this.brs);
        driver.manage().window().maximize();

        driver.get(URL);

        wait = new WebDriverWait(driver, 60);
        cart = new Cart(driver, wait);
        home = new Home(driver, wait);
        laptops = new Laptops(driver, wait);
        monitors = new Monitors(driver, wait);
        phones = new Phones(driver, wait);
        driver.get(URL);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
