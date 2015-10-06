package com.qantium.uisteps.serenity.browser.pages.elements;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.SerenityUtils;
import org.openqa.selenium.WebElement;

/**
 *
 * @author ASolyankin
 */
public class TextField extends com.qantium.uisteps.core.browser.pages.elements.TextField {

    public TextField(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public Browser inOpenedBrowser() {
        return SerenityUtils.getCurrentBrowser();
    }
}
