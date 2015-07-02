package com.knight.exmaple.pageobjects;

import com.knight.exmaple.handlers.StatusCodesDashboardHandler;


/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public interface Home extends LoadablePageObject<Home>
{
    StatusCodesDashboardHandler navigateToStatusCodesDashboard();
    Home placeHolderMethod();
    Home placeHolderMethod2();
}
