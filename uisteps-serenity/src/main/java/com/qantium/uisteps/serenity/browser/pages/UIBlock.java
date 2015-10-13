package com.qantium.uisteps.serenity.browser.pages;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.SerenityUtils;
import org.openqa.selenium.By;

/**
 *
 * @author ASolyankin
 */
public class UIBlock extends com.qantium.uisteps.core.browser.pages.UIBlock {

    public UIBlock() {
    }

    public UIBlock(By locator) {
        super(locator);
    }

    @Override
    public Browser inOpenedBrowser() {
        return SerenityUtils.getCurrentBrowser();
    }
}
