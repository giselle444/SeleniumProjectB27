package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //1-Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        //2-Create an instance of the chrome driver
        WebDriver driver= new ChromeDriver();

        //3- test if driver is working
        driver.get("https://www.sephora.com");
    }
}
