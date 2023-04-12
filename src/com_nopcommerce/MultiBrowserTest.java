package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://demo.nopcommerce.com";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) { // Allocating the Driver according to the browser type
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        driver.manage().window().maximize(); // Maximizing the window
        driver.get(baseUrl); // Launching the browser
        System.out.println("The Page Title : " + driver.getTitle()); // Getting the title of the page
        System.out.println("The Current URL : " + driver.getCurrentUrl()); // Getting the current URL
        System.out.println("The Page Source : " + driver.getPageSource()); // Getting the page source
        WebElement loginLink = driver.findElement(By.linkText("Log in")); // Finding the login link element
        loginLink.click(); // Clicking on the login link element
        WebElement emailField = driver.findElement(By.id("Email")); // Finding the email field element
        emailField.sendKeys("prime123@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Prime123"); // Finding the password field element
        driver.close(); // Closing the browser

    }
}
