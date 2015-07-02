package com.knight.exmaple.handlers;

import com.knight.exmaple.pageobjects.StatusCodesDashboard;
import com.knight.exmaple.pageobjects.StatusCodesDashboardPO;
import org.openqa.selenium.WebDriver;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class StatusCodesDashboardHandlerImpl implements StatusCodesDashboardHandler
{
    private StatusCodesDashboard statusCodesDashboard;

    @Override
    public StatusCodesDashboard statusCodesDashboard()
    {
        return statusCodesDashboard.get();
    }
    public StatusCodesDashboardHandlerImpl(WebDriver driver)
    {
        statusCodesDashboard = new StatusCodesDashboardPO(driver);
    }
}
