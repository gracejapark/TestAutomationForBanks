package com.jungah.test.automation.td.loan.quote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSellenium {
    public static void main(String[] args) throws InterruptedException{
        String  firefoxDriverPath = "C:\\Project\\WebDriver\\geckodriver.exe";
        String URL_PERSONAL_HOME = "https://www.td.com/ca/en/personal-banking/";
        WebDriver webDriver;

        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);

        webDriver = new FirefoxDriver();
        webDriver.get(URL_PERSONAL_HOME);
        webDriver.manage().window().maximize();
        System.out.println(webDriver.getTitle());
        Thread.sleep(5000);
        webDriver.close();
    }
}
