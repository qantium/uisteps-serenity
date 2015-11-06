/*
 * Copyright 2015 ASolyankin.
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

import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.serenity.browser.BrowserFactory;
import net.thucydides.core.annotations.Step;

/**
 *
 * @author ASolyankin
 */
public class User extends com.qantium.uisteps.core.user.User {

    public User() {
        super(new BrowserFactory());
    }

    protected Browser use(Browser browser) {
        SerenityUtils.useDriver(((com.qantium.uisteps.serenity.browser.Browser) browser).getName());
        return browser;
    }

    @Step
    @Override
    public Browser switchToLastBrowser() {
        return use(super.switchToLastBrowser());
    }

    @Step
    @Override
    public Browser switchToBrowserByIndex(int index) {
        return use(super.switchToBrowserByIndex(index));
    }

    @Step
    @Override
    public Browser switchToDefaultBrowser() {
        return use(super.switchToDefaultBrowser());
    }

    @Step
    @Override
    public Browser switchToPreviousBrowser() {
        return use(super.switchToPreviousBrowser());
    }

    @Step
    @Override
    public Browser switchToNextBrowser() {
        return use(super.switchToNextBrowser());
    }

    @Step
    @Override
    public void closeAllBrowsers() {
        super.closeAllBrowsers();
    }

    @Step
    @Override
    public void closeCurrentBrowser() {
        super.closeCurrentBrowser();
    }
}
