package com.qantium.uisteps.serenity.browser.pages;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.SerenityUtils;
import org.openqa.selenium.WebElement;

/**
 *
 * @author ASolyankin
 */
public class UIElement extends com.qantium.uisteps.core.browser.pages.UIElement {

    public UIElement(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public Browser inOpenedBrowser() {
        return SerenityUtils.getCurrentBrowser();
    }

}
