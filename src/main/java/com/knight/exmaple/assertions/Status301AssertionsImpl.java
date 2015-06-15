package com.knight.exmaple.assertions;

import com.knight.exmaple.pageobjects.Status301;
import com.knight.exmaple.pageobjects.Status301PO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status301AssertionsImpl implements Status301Assertions
{
    private Status301 status301;

    @Override
    public Status301Assertions verify301StatusCodeIsDisplayed()
    {
        Assert.assertTrue(status301.readStatusCodeText().contains("301"), "status code 301 was not displayed");
        return this;
    }
    public Status301AssertionsImpl(WebDriver driver)
    {
        this.status301 = new Status301PO(driver);
    }
}
