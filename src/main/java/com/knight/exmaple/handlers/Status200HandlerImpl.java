package com.knight.exmaple.handlers;

import com.knight.exmaple.pageobjects.Status200;
import com.knight.exmaple.pageobjects.Status200PO;
import org.openqa.selenium.WebDriver;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status200HandlerImpl implements Status200Handler
{
    private Status200 status200;

    @Override
    public Status200 status200()
    {
        return status200.get();
    }
    public Status200HandlerImpl(WebDriver driver)
    {
        status200 = new Status200PO(driver);
    }
}