package com.qantium.uisteps.serenity.browser.pages;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.name.NameConvertor;
import org.codehaus.plexus.util.StringUtils;
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
    public String getName() {

        String name = super.getName();

        if (!StringUtils.isEmpty(name)) {
            setName(NameConvertor.humanize(getClass()));
        }

        return name;
    }

    
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public Browser inOpenedBrowser() {
        return SerenityUtils.getCurrentBrowser();
    }
}
