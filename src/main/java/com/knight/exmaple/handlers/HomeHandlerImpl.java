package com.knight.exmaple.handlers;

import com.knight.exmaple.pageobjects.Home;
import com.knight.exmaple.pageobjects.HomePO;
import org.openqa.selenium.WebDriver;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class HomeHandlerImpl implements HomeHandler
{
    private Home home;

    @Override
    public Home home()
    {
        return home.get();
    }
    public HomeHandlerImpl(WebDriver driver)
    {
        home = new HomePO(driver);
    }
}