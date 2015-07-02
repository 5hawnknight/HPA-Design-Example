package com.knight.example.tests;

import org.testng.annotations.Test;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Example301StatusCodeTest extends BaseTest
{

    @Test
    public void test()
    {
        home()
            .navigateToStatusCodesDashboard()
        .statusCodesDashboard()
            .navigateToStatus301()
        .status301();

        assertions().status301Assertions().verify301StatusCodeIsDisplayed();
    }
}