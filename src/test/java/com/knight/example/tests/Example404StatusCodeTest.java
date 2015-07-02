package com.knight.example.tests;

import org.testng.annotations.Test;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Example404StatusCodeTest extends BaseTest
{

    @Test
    public void test()
    {
        home()
            .navigateToStatusCodesDashboard()
        .statusCodesDashboard()
            .navigateToStatus404()
        .status404();

        assertions().status404Assertions().verify404StatusCodeIsDisplayed();
    }
}