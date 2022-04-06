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

        //Register - Account Details
        /*
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Andres");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Ospina");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("andress.osspina@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("3233926725");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("AO0102");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("AO0102");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
         */

        //Login
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("andress.osspina@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("AO0102");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        Thread.sleep(3000);

        //Purchase
        driver.findElement(By.xpath("//a[contains(text(),'Tablets')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Cameras')])[2]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Mac ')]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[1]")).click();
        Thread.sleep(3000);
        //Checkout
        driver.findElement(By.xpath("//span[@id='cart-total']")).click();
        driver.findElement(By.xpath("(//i[@class='fa fa-share'])[2]")).click();
        Thread.sleep(3000);
        //Billing Details
        driver.findElement(By.xpath("(//input[@name='payment_address'])[2]")).click();
        driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("Andres");
        driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("Ospina");
        driver.findElement(By.xpath("//input[@id='input-payment-company']")).sendKeys("TSO Mobile");
        driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys("Calle 30N");
        driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("Cali");
        driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys("760001");
        driver.findElement(By.xpath("//select[@id='input-payment-country']")).click();
        driver.findElement(By.xpath("//option[@value='47']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='input-payment-zone']")).click();
        driver.findElement(By.xpath("//option[@value='750']")).click();
        driver.findElement(By.xpath("//input[@id='button-payment-address']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='button-shipping-address']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Esto es una compra de prueba");
        driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='button-confirm']")).click();

    }

    @After
    public void close() {
       driver.close();
    }
}
