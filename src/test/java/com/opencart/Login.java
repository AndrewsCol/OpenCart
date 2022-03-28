package com.opencart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webchromedriver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://opencart.abstracta.us/");
        driver.manage().window().maximize();
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        Thread.sleep(3000);

        //Account Details
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Andres");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Ospina");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("andress.osspina@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("3233926725");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("AO0102");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("AO0102");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
    }

    @After
    public void close() {
        driver.close();
    }
}
