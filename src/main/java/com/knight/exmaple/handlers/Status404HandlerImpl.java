package com.knight.exmaple.handlers;

import com.knight.exmaple.pageobjects.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status404HandlerImpl implements Status404Handler
{
    private Status404 status404;

    @Override
    public Status404 status404()
    {
        return status404.isLoaded();
    }
    public Status404HandlerImpl(WebDriver driver)
    {
        status404 = new Status404PO(driver);
    }
}
