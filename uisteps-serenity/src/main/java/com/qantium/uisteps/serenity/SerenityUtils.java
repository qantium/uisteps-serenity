/*
 * Copyright 2014 ASolyankin.
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

import com.qantium.uisteps.core.browser.Browser;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.SessionMap;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.steps.StepEventBus;
import net.thucydides.core.steps.StepFactory;
import net.thucydides.core.steps.StepListener;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;
import net.thucydides.core.webdriver.SupportedWebDriver;
import net.thucydides.core.webdriver.ThucydidesWebdriverManager;
import net.thucydides.core.webdriver.WebDriverFacade;
import net.thucydides.core.webdriver.WebDriverFactory;
import net.thucydides.core.webdriver.WebdriverInstances;
import net.thucydides.core.webdriver.WebdriverManager;
import net.thucydides.core.webdriver.WebdriverProxyFactory;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Asolyankin
 */
public class SerenityUtils {

    public final static String BROWSER_SESSION_KEY = "#BROWSER#";

    public void putToSession(Browser browser) {
        putToSession(BROWSER_SESSION_KEY, browser);
    }

    public Browser getCurrentBrowser() {
        return (Browser) getFromSession(BROWSER_SESSION_KEY);
    }

    public WebDriver getCurrentDriver() {
        return getDrivers().getCurrentDriver();
    }

    public <T> T getNewStepLibrary(Class<T> stepLibraryClass) {
        return getStepFactory().instantiateNewStepLibraryFor(stepLibraryClass);
    }

    public StepFactory getStepFactory() {
        return new StepFactory();
    }

    public String getBaseUrl() {
        return getConfiguration().getBaseUrl();
    }

    public void putToSession(String key, Object value) {
        getCurrentSession().put(key, value);
    }

    public Object getFromSession(String key) {
        return getCurrentSession().get(key);
    }

    public SessionMap<Object, Object> getCurrentSession() {
        return Serenity.getCurrentSession();
    }

    public void registerListener(StepListener stepsListener) {
        StepEventBus.getEventBus().registerListener(stepsListener);
    }

    public Configuration getConfiguration() {
        return Injectors.getInjector().getInstance(Configuration.class);
    }

    public WebDriver getNewDriver() {
        return getNewDriver(getConfiguration().getDriverType());
    }

    public WebDriver getNewDriver(SupportedWebDriver supportedDriver) {
        String driverName = "" + UUID.randomUUID();

        WebDriverFactory webDriverFactory = new WebDriverFactory();
        Configuration configuration = getConfiguration();

        Class<? extends WebDriver> webDriverType = new WebDriverFactory().getClassFor(supportedDriver);
        WebDriver driver = WebdriverProxyFactory.getFactory().proxyFor(webDriverType, webDriverFactory, configuration);
        EnvironmentVariables environmentVariables = configuration.getEnvironmentVariables();
        
        WebDriverFacade webDriverFacade = new ProxyWebDriverFacade(driverName, driver, webDriverFactory, environmentVariables);

        WebdriverInstances drivers = getDrivers();

        drivers.registerDriverCalled(driverName).forDriver(webDriverFacade);
        drivers.useDriver(driverName);
        return driver;
    }

    public void useDriver(String driverName) {
        getDrivers().useDriver(driverName);
    }

    public WebDriver getNewDriver(String driverType) {
        return getNewDriver(SupportedWebDriver.valueOf(driverType.toUpperCase()));
    }

    public WebdriverInstances getDrivers() {
        String methodName = "inThisTestThread";

        try {
            Method method = ThucydidesWebdriverManager.class.getDeclaredMethod(methodName);
            method.setAccessible(true);

            return (WebdriverInstances) method.invoke(null);
        } catch (InvocationTargetException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException ex) {
            throw new RuntimeException("Cannot invoke method by name " + methodName + " in class " + ThucydidesWebdriverManager.class + "!\nCause: " + ex);
        }
    }

    public WebdriverManager getWebdriverManager() {
        WebdriverManager webdriverManager = null;
        String methodName = "getWebdriverManager";

        try {
            Method getWebdriverManagerMethod = Serenity.class.getDeclaredMethod(methodName);
            getWebdriverManagerMethod.setAccessible(true);
            webdriverManager = (WebdriverManager) getWebdriverManagerMethod.invoke(null);
        } catch (InvocationTargetException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException ex) {
            throw new RuntimeException("Cannot invoke method by name " + methodName + " in class " + Serenity.class + "!\nCause: " + ex);
        }

        if (webdriverManager == null) {
            webdriverManager = Injectors.getInjector().getInstance(ThucydidesWebdriverManager.class);
        }
        return webdriverManager;
    }
}
