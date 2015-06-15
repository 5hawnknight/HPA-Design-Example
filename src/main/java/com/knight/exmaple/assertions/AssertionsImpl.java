package com.knight.exmaple.assertions;

import org.openqa.selenium.WebDriver;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public class AssertionsImpl implements Assertions
{
    private WebDriver driver;

    @Override
    public Status200Assertions status200Assertions()
    {
        return new Status200AssertionsImpl(driver);
    }

    @Override
    public Status301Assertions status301Assertions()
    {
        return new Status301AssertionsImpl(driver);
    }

    @Override
    public Status404Assertions status404Assertions()
    {
        return new Status404AssertionsImpl(driver);
    }

    @Override
    public Status500Assertions status500Assertions()
    {
        return new Status500AssertionsImpl(driver);
    }

    public AssertionsImpl(WebDriver driver)
    {
        this.driver = driver;
    }
}