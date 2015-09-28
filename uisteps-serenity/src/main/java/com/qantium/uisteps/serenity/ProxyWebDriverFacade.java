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
package com.qantium.uisteps.serenity;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.WebDriverFacade;
import net.thucydides.core.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author A.Solyankin
 */
public class ProxyWebDriverFacade extends WebDriverFacade {

    private final String name;

    public ProxyWebDriverFacade(String name, final Class<? extends WebDriver> driver, WebDriverFactory webDriverFactory) {
        super(driver, webDriverFactory);
        this.name = name;
    }
    
    public String getDriverName() {
        return name;
    }

    @Override
    public WebDriver getDriverInstance() {
        return super.getDriverInstance();
    }

}
