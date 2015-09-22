/*
 * Copyright 2015 A.Solyankin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qantium.uisteps.serenity.user;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.thucydides.browser.BrowserFactory;
import net.thucydides.core.webdriver.SupportedWebDriver;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author A.Solyankin
 */
public class User extends com.qantium.uisteps.thucydides.user.User {

    public User() {
        this(new BrowserFactory());
    }

    public User(BrowserFactory browserFactory) {
        super(browserFactory);
    }

    @Override
    protected Browser register(Browser browser) {
        SerenityUtils serenityUtils = new SerenityUtils();
        serenityUtils.putToSession(browser);
        serenityUtils.getBaseStepListener().setDriver(browser.getDriver());
        return browser;
    }

    @Override
    protected WebDriver getNewDriver(SupportedWebDriver driver) {
        return new SerenityUtils().getNewDriver(driver);
    }
}
