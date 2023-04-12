package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        // Assigning baseUrl value
        String baseUrl = "https://demo.nopcommerce.com/";

        // Launching the browser
        WebDriver driver = new ChromeDriver();
        // Opening the URL into the browser
        driver.get(baseUrl);
        // Maximizing the browser
        driver.manage().window().maximize();
        // Giving the implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Getting the title of the page
        String title = driver.getTitle();
        System.out.println("The Page Title : " + title);
        // Getting the current URL
        System.out.println("The Current URL : " + driver.getCurrentUrl());
        // Getting the page source
        System.out.println("The Page Source : " + driver.getPageSource());
        // Finding the Login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        // Clicking on the login link element
        loginLink.click();
        // Finding the email field link element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");
        // Finding the password field link element
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        // Closing the browser
        driver.close();
    }
}
