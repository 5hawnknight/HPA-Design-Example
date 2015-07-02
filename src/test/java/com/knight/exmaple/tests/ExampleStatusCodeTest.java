package com.knight.exmaple.tests;

import org.testng.annotations.Test;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class ExampleStatusCodeTest extends BaseTest
{

    @Test
    public void test()
    {
        home()
            .placeHolderMethod().andThen()
            .placeHolderMethod2().andThen()
            .navigateToStatusCodesDashboard()
        .statusCodesDashboard()
            .navigateToStatus200()
        .status200()
            .navigateToStatusCodesDashboard()
        .statusCodesDashboard()
            .navigateToStatus301()
        .status301()
            .navigateToStatusCodesDashboard()
        .statusCodesDashboard()
            .navigateToStatus500()
        .status500()
            .navigateToStatusCodesDashboard()
        .statusCodesDashboard()
            .navigateToStatus200()
        .status200();

        assertions().status200Assertions().verify200StatusCodeIsDisplayed();
    }
}