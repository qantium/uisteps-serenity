package com.qantium.uisteps.serenity.browser.pages;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.name.NameConvertor;

/**
 *
 * @author ASolyankin
 */
public class UIBlock extends com.qantium.uisteps.core.browser.pages.UIBlock {

    @Override
    public String toString() {
        return NameConvertor.humanize(getClass());
    }

    @Override
    public Browser inOpenedBrowser() {
        return SerenityUtils.getCurrentBrowser();
    }
}
