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

    @Step
    @Override
    protected Browser open(Browser browser) {
        return browser;
    }

    @Step
    @Override
    public Browser switchToLastBrowser() {
        return open(super.switchToLastBrowser());
    }

    @Step
    @Override
    public Browser switchToBrowserByIndex(int index) {
        return open(super.switchToBrowserByIndex(index));
    }

    @Step
    @Override
    public Browser switchToDefaultBrowser() {
        return open(super.switchToDefaultBrowser());
    }

    @Step
    @Override
    public Browser switchToPreviousBrowser() {
        return open(super.switchToPreviousBrowser());
    }

    @Step
    @Override
    public Browser switchToNextBrowser() {
        return open(super.switchToNextBrowser());
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
