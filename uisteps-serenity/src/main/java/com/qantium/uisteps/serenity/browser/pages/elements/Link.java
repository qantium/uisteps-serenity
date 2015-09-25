package com.qantium.uisteps.serenity.browser.pages.elements;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.SerenityUtils;
import org.openqa.selenium.WebElement;

/**
 *
 * @author ASolyankin
 */
public class Link extends com.qantium.uisteps.core.browser.pages.elements.Link {

    public Link(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public Browser inOpenedBrowser() {
        return new SerenityUtils().getCurrentBrowser();
    }

}
