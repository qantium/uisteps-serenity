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
package com.qantium.uisteps.serenity.browser;

import com.qantium.uisteps.core.browser.Browser;
import net.thucydides.core.annotations.Step;

/**
 *
 * @author A.Solyankin
 */
public class BrowserManager extends com.qantium.uisteps.core.browser.BrowserManager {

    public BrowserManager() {
        setBrowserFactory(new BrowserFactory());
    }

    @Step
    @Override
    public Browser open(Browser browser) {
        return super.open(browser);
    }

    @Step
    @Override
    public Browser switchToBrowserByIndex(int index) {
        return super.switchToBrowserByIndex(index);
    }

    @Step
    @Override
    public void closeCurrentBrowser() {
        super.closeCurrentBrowser();
    }

    @Step
    @Override
    public void closeAllBrowsers() {
        super.closeAllBrowsers();
    }
}
