package com.knight.exmaple.assertions;

import com.knight.exmaple.pageobjects.Status500;
import com.knight.exmaple.pageobjects.Status500PO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status500AssertionsImpl implements Status500Assertions
{
    private Status500 status500;

    @Override
    public Status500Assertions verify500StatusCodeIsDisplayed()
    {
        Assert.assertTrue(status500.readStatusCodeText().contains("500"), "status code 500 was not displayed");
        return this;
    }
    public Status500AssertionsImpl(WebDriver driver)
    {
        this.status500 = new Status500PO(driver);
    }
}
