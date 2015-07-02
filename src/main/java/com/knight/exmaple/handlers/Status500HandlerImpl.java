package com.knight.exmaple.handlers;

import com.knight.exmaple.pageobjects.Status500;
import com.knight.exmaple.pageobjects.Status500PO;
import org.openqa.selenium.WebDriver;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status500HandlerImpl implements Status500Handler
{
    private Status500 status500;

    @Override
    public Status500 status500()
    {
        return status500.get();
    }
    public Status500HandlerImpl(WebDriver driver)
    {
        status500 = new Status500PO(driver);
    }
}
