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

import com.qantium.uisteps.thucydides.ThucydidesUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.webdriver.WebdriverManager;
import net.thucydides.core.webdriver.ThucydidesWebdriverManager;

/**
 *
 * @author A.Solyankin
 */
public class SerenityUtils extends ThucydidesUtils {

    @Override
    public void putToSession(String key, Object value) {
        Serenity.getCurrentSession().put(key, value);
    }

    @Override
    public Object getFromSession(String key) {
        return Serenity.getCurrentSession().get(key);
    }

    @Override
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
