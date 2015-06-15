package com.knight.exmaple.assertions;

import com.knight.exmaple.pageobjects.Status404;
import com.knight.exmaple.pageobjects.Status404PO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class Status404AssertionsImpl implements Status404Assertions
{
    private Status404 status404;

    @Override
    public Status404Assertions verify404StatusCodeIsDisplayed()
    {
        Assert.assertTrue(status404.readStatusCodeText().contains("404"), "status code 404 was not displayed");
        return this;
    }
    public Status404AssertionsImpl(WebDriver driver)
    {
        this.status404 = new Status404PO(driver);
    }
}
