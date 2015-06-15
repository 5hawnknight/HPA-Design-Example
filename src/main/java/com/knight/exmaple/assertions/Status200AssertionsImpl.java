package com.knight.exmaple.assertions;

import com.knight.exmaple.pageobjects.Status200;
import com.knight.exmaple.pageobjects.Status200PO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status200AssertionsImpl implements Status200Assertions
{
    private Status200 status200;

    @Override
    public Status200Assertions verify200StatusCodeIsDisplayed()
    {
        Assert.assertTrue(status200.readStatusCodeText().contains("200"), "status code 200 was not displayed");
        return this;
    }
    public Status200AssertionsImpl(WebDriver driver)
    {
        this.status200 = new Status200PO(driver);
    }
}