package com.knight.exmaple.handlers;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public interface Handlers
{
    HomeHandler homeHandler();

    StatusCodesDashboardHandler statusCodesDashboardHandler();

    Status200Handler status200Handler();

    Status301Handler status301Handler();

    Status404Handler status404Handler();

    Status500Handler status500Handler();
}
