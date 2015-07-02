package com.knight.example.tests;

import org.testng.annotations.Test;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Example500StatusCodeTest extends BaseTest
{

    @Test
    public void test()
    {
        home()
            .navigateToStatusCodesDashboard()
        .statusCodesDashboard()
            .navigateToStatus500()
        .status500();

        assertions().status500Assertions().verify500StatusCodeIsDisplayed();
    }
}