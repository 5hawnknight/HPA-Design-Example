package com.knight.example.tests;

import com.knight.exmaple.assertions.Assertions;
import com.knight.exmaple.assertions.AssertionsImpl;
import com.knight.exmaple.handlers.HomeHandlerImpl;
import com.knight.exmaple.pageobjects.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class BaseTest
{
    private WebDriver driver;

    public Home home()
    {
        return new HomeHandlerImpl(driver).home();
    }

    public Assertions assertions()
    {
        return new AssertionsImpl(driver);
    }

    @BeforeTest
    public void setDriver()
    {
        this.driver = new FirefoxDriver();
    }

    @BeforeTest
    public void setUrl()
    {
        driver.get("http://the-internet.herokuapp.com");
    }

    @AfterTest
    public void teardown()
    {
        driver.quit();
    }
}