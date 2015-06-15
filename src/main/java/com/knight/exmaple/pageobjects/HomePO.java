package com.knight.exmaple.pageobjects;

import com.knight.exmaple.handlers.StatusCodesDashboardHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Arrays;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class HomePO extends PageObject implements Home
{
    private By stateCodeLink = By.cssSelector("a[href *= 'status_codes']");

    public StatusCodesDashboardHandler navigateToStatusCodesDashboard()
    {
        getDriver().findElement(stateCodeLink).click();
        return getHandlers().statusCodesDashboardHandler();
    }

    public Home isLoaded()
    {
        if (isHomeNotLoaded())
            Assert.fail("home page failed to load");
        return this;
    }

    private boolean isHomeNotLoaded()
    {
        return isNotLoaded(Arrays.asList(stateCodeLink));
    }

    public HomePO(WebDriver driver)
    {
        super(driver);
    }
}