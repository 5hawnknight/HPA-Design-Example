package com.knight.exmaple.pageobjects;

import com.knight.exmaple.handlers.Status200Handler;
import com.knight.exmaple.handlers.Status301Handler;
import com.knight.exmaple.handlers.Status404Handler;
import com.knight.exmaple.handlers.Status500Handler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class StatusCodesDashboardPO extends PageObject implements StatusCodesDashboard
{
    private By status200Link = By.cssSelector("a[href='status_codes/200']");
    private By status301Link = By.cssSelector("a[href='status_codes/301']");
    private By status404Link = By.cssSelector("a[href='status_codes/404']");
    private By status500Link = By.cssSelector("a[href='status_codes/500']");

    @Override
    public Status200Handler navigateToStatus200()
    {
        getDriver().findElement(status200Link).click();
        return getHandlers().status200Handler();
    }
    @Override
    public Status301Handler navigateToStatus301()
    {
        getDriver().findElement(status301Link).click();
        return getHandlers().status301Handler();
    }
    @Override
    public Status404Handler navigateToStatus404()
    {
        getDriver().findElement(status404Link).click();
        return getHandlers().status404Handler();
    }
    @Override
    public Status500Handler navigateToStatus500()
    {
        getDriver().findElement(status500Link).click();
        return getHandlers().status500Handler();
    }

    public StatusCodesDashboardPO(WebDriver driver)
    {
        super(driver);
    }

    @Override
    public boolean isLoaded()
    {
        return isLoaded(Arrays.asList(status200Link,status301Link,status404Link,status500Link));
    }
}