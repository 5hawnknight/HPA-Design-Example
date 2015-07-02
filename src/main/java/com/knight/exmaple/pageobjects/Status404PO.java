package com.knight.exmaple.pageobjects;

import com.knight.exmaple.handlers.StatusCodesDashboardHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status404PO extends PageObject implements Status404
{
    private By hereLink = By.cssSelector("a[href *= 'status_codes']");
    private By statusCodeText = By.cssSelector(".example p");

    @Override
    public StatusCodesDashboardHandler navigateToStatusCodesDashboard()
    {
        getDriver().findElement(hereLink).click();
        return getHandlers().statusCodesDashboardHandler();
    }

    @Override
    public String readStatusCodeText()
    {
        return getDriver().findElement(statusCodeText).getText();
    }

    public Status404PO(WebDriver driver)
    {
        super(driver);
    }

    @Override
    public boolean isLoaded()
    {
        return isLoaded(Arrays.asList(hereLink));
    }
}