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
package com.qantium.uisteps.serenity.browser;

import com.qantium.uisteps.serenity.SerenityUtils;
import org.openqa.selenium.WebDriver;

/**
 * {@inheritDoc}
 * 
 * @author ASolyankin
 */
public class BrowserFactory extends com.qantium.uisteps.core.browser.BrowserFactory {

    /**
     * Get browser as step library
     * 
     * {@inheritDoc}
     */
    @Override
    public Browser getBrowser(WebDriver driver) {
        setSettingsTo(driver);
        Browser browser = SerenityUtils.getNewStepLibrary(Browser.class);
        browser.setDriver(SerenityUtils.useDriver(driver));
        return browser;
    }
}
