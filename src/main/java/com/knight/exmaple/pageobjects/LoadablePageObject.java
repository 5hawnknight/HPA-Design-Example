package com.knight.exmaple.pageobjects;

import org.testng.Assert;

/**
 * Created by shawn knight on 7/01/15.
 * Email: shawn.knight.work@gmail.com
 */

@FunctionalInterface
public interface LoadablePageObject<T>
{
    default T get()
    {
        if (!isLoaded())
            Assert.fail(this.getClass().getSimpleName() + " failed to load");
        return (T) this;
     }
    default T andThen()
    {
        return (T) this;
    }

    boolean isLoaded();
}