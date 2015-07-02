package com.knight.exmaple.handlers;

import com.knight.exmaple.pageobjects.Status301;
import com.knight.exmaple.pageobjects.Status301PO;
import org.openqa.selenium.WebDriver;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status301HandlerImpl implements Status301Handler
{
    private Status301 status301;

    @Override
    public Status301 status301()
    {
        return status301.get();
    }
    public Status301HandlerImpl(WebDriver driver)
    {
        status301 = new Status301PO(driver);
    }
}