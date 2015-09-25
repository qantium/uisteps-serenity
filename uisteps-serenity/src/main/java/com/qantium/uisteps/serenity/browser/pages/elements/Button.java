package com.qantium.uisteps.serenity.browser.pages.elements;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.SerenityUtils;
import org.openqa.selenium.WebElement;

/**
 *
 * @author ASolyankin
 */
public class Button extends com.qantium.uisteps.core.browser.pages.elements.Button {

    public Button(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public Browser inOpenedBrowser() {
        return new SerenityUtils().getCurrentBrowser();
    }
}
