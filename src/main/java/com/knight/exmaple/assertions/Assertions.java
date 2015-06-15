package com.knight.exmaple.assertions;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public interface Assertions
{
    Status200Assertions status200Assertions();

    Status301Assertions status301Assertions();

    Status404Assertions status404Assertions();

    Status500Assertions status500Assertions();
}
