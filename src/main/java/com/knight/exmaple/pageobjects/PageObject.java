package com.knight.exmaple.pageobjects;

import com.knight.exmaple.handlers.Handlers;
import com.knight.exmaple.handlers.HandlersImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public abstract class PageObject
{
    private WebDriver driver;

    public WebDriver getDriver()
    {
        return driver;
    }
    public PageObject(WebDriver driver)
    {
        this.driver = driver;
    }
    public Handlers getHandlers()
    {
        return new HandlersImpl(driver);
    }
    public boolean isNotLoaded(List<By> bys)
    {
        return !isLoaded(bys);
    }
    public boolean isLoaded(List<By> bys)
    {
        for (By by : bys)
        {
            try
            {
                new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(by));
            }
            catch (Exception e)
            {
                return false;
            }
        }
        return true;
    }
}
