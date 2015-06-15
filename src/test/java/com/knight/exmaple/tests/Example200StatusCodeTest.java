package com.knight.exmaple.tests;

import org.testng.annotations.Test;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Example200StatusCodeTest extends BaseTest
{

    @Test
    public void test()
    {
        home()
            .navigateToStatusCodesDashboard()
        .statusCodesDashboard()
            .navigateToStatus200()
        .status200();

        assertions().status200Assertions().verify200StatusCodeIsDisplayed();
    }
}