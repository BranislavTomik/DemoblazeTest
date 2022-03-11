package com.demoblaze.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    WebDriver driver;


    public WebDriver open(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Branislav\\IdeaProjects\\DemoblazeTest\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.out.println("Browser unknown!");
        }
        return driver;
    }


}
