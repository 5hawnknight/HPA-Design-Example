package com.knight.exmaple.handlers;

import org.openqa.selenium.WebDriver;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class HandlersImpl implements Handlers
{
    private WebDriver driver;

    @Override
    public HomeHandler homeHandler()
    {
        return new HomeHandlerImpl(driver);
    }

    @Override
    public StatusCodesDashboardHandler statusCodesDashboardHandler()
    {
        return new StatusCodesDashboardHandlerImpl(driver);
    }

    @Override
    public Status200Handler status200Handler()
    {
        return new Status200HandlerImpl(driver);
    }

    @Override
    public Status301Handler status301Handler()
    {
        return new Status301HandlerImpl(driver);
    }

    @Override
    public Status404Handler status404Handler()
    {
        return new Status404HandlerImpl(driver);
    }

    @Override
    public Status500Handler status500Handler()
    {
        return new Status500HandlerImpl(driver);
    }

    public HandlersImpl(WebDriver driver)
    {
        this.driver = driver;
    }
}