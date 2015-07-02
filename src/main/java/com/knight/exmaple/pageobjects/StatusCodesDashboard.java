package com.knight.exmaple.pageobjects;

import com.knight.exmaple.handlers.Status200Handler;
import com.knight.exmaple.handlers.Status301Handler;
import com.knight.exmaple.handlers.Status404Handler;
import com.knight.exmaple.handlers.Status500Handler;

/**
 * Created by shawn knight on 5/29/15.
 * Email: shawn.knight.work@gmail.com
 */
public interface StatusCodesDashboard extends LoadablePageObject<StatusCodesDashboard>
{
    Status200Handler navigateToStatus200();

    Status301Handler navigateToStatus301();

    Status404Handler navigateToStatus404();

    Status500Handler navigateToStatus500();
}
