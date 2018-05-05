package com.jungah.automation.rbc.loan.quote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {
    public static void main(String[] args)throws InterruptedException {
        String firefoxDrivePath = "C:\\Project\\WebDriver\\geckodriver.exe";
        String URL_PERSONAL_HOME = "http://www.rbcroyalbank.com/personal.html";
        WebDriver webDriver;

        System.setProperty("webdriver.gecko.driver", firefoxDrivePath);

        //create a FireFox driver
        webDriver = new FirefoxDriver();
        webDriver.get(URL_PERSONAL_HOME);
        webDriver.manage().window().maximize();

        System.out.println(webDriver.getTitle());
        Thread.sleep(5000);
        webDriver.close();

    }
}
