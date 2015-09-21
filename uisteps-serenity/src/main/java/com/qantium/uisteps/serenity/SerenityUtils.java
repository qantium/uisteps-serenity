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

//import com.qantium.uisteps.core.user.browser.Browser;
import com.qantium.uisteps.thucydides.ThucydidesUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.SerenitySystemProperties;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.steps.StepFactory;
import net.thucydides.core.steps.StepListener;
import net.thucydides.core.webdriver.Configuration;
import net.thucydides.core.webdriver.WebdriverManager;
import net.thucydides.core.webdriver.SupportedWebDriver;
import net.thucydides.core.webdriver.ThucydidesWebdriverManager;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author A.Solyankin
 */
public class SerenityUtils extends Serenity {
    
    private static int driverCounter = 0;
    
    public void m() {
        
    }

    public static Browser getCurrentBrowser() {
        return (Browser) getFromSession(ThucydidesUtils.BROWSER_SESSION_KEY);
    }

    public static <T> T getNewStepLibrary(Class<T> stepLibraryClass) {
        return ThucydidesUtils.getNewStepLibrary(stepLibraryClass);
    }
    
    public static StepFactory getStepFactory() {
        return ThucydidesUtils.getStepFactory();
    }

    public static String getBaseUrl() {
        return ThucydidesUtils.getBaseUrl();
    }

    public static void putToSession(String key, Object value) {
        getCurrentSession().put(key, value);
    }

    public static Object getFromSession(String key) {
        return getCurrentSession().get(key);
    }

    public static void registerListener(StepListener stepsListener) {
        ThucydidesUtils.registerListener(stepsListener);
    }

    public static Configuration getConfiguration() {
        return ThucydidesUtils.getConfiguration();
    }

    public static Integer getImplementTimeout() {
        return getSystemProperties().getIntegerValue(ThucydidesSystemProperty.WEBDRIVER_TIMEOUTS_IMPLICITLYWAIT, 100000);
    }

    public static SerenitySystemProperties getSystemProperties() {
        return SerenitySystemProperties.getProperties();
    }

    public static Integer getImplementTimeoutInSec() {
        return getImplementTimeout() / 1000;
    }

    public static WebDriver getNewDriver() {
        return getNewDriver(getConfiguration().getDriverType());
    }

    public static WebDriver getNewDriver(SupportedWebDriver supportedDriver) {

        String driverName = "#" + (++driverCounter);
        String driverType = supportedDriver.name().toLowerCase();
        WebDriver driver = getWebdriverManager().getWebdriver(driverType);

        ThucydidesUtils.getDrivers().registerDriverCalled(driverName).forDriver(driver);
        ThucydidesUtils.getBaseStepListener().setDriver(driver);
        ThucydidesUtils.getDriversMap().remove(driverType);
        return driver;
    }

    public static WebdriverManager getWebdriverManager() {
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
