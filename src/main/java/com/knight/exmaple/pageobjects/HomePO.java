package com.knight.exmaple.pageobjects;

import com.knight.exmaple.handlers.StatusCodesDashboardHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    @Override
    public Home placeHolderMethod()
    {
        return this;
    }

    @Override
    public Home placeHolderMethod2()
    {
        return this;
    }

    public HomePO(WebDriver driver)
    {
        super(driver);
    }

    @Override
    public boolean isLoaded()
    {
        return isLoaded(Arrays.asList(stateCodeLink));
    }
}