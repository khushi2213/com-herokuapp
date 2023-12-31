package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        //1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Open the URL into Browser
        driver.get(baseUrl);

        //3. Print the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        //4. Print the Current URL
        System.out.println("Current URL is " + driver.getCurrentUrl());

        //5. Print the  Page Source
        System.out.println("Page source is : " + driver.getPageSource());

        //6. Enter the email to email field
        //Find the Email Field Element
        WebElement usernameField = driver.findElement(By.name("username"));

        //Action is Type the username .
        usernameField.sendKeys("Khushi123");

        //7. Enter the password to password field
        //Find the Password Field Element
        WebElement passwordField = driver.findElement(By.id("password"));

        //Action is to Type the password .
        passwordField.sendKeys("Khushi221@");


        //8.Close The Browser
        driver.close();

    }

}
