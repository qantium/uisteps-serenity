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
package com.qantium.uisteps.serenity.run.tests;

import com.google.inject.Injector;
import com.google.inject.Module;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.batches.BatchManager;
import net.thucydides.core.webdriver.Configuration;
import net.thucydides.core.webdriver.WebDriverFactory;
import net.thucydides.core.webdriver.WebdriverManager;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

/**
 *
 * @author A.Solyankin
 */
public class JUnitRunner extends SerenityRunner {

    public JUnitRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    public JUnitRunner(Class<?> klass, Module module) throws InitializationError {
        super(klass, module);
    }

    public JUnitRunner(Class<?> klass, Injector injector) throws InitializationError {
        super(klass, injector);
    }

    public JUnitRunner(Class<?> klass, WebDriverFactory webDriverFactory) throws InitializationError {
        super(klass, webDriverFactory);
    }

    public JUnitRunner(Class<?> klass, WebDriverFactory webDriverFactory, Configuration configuration) throws InitializationError {
        super(klass, webDriverFactory, configuration);
    }

    public JUnitRunner(Class<?> klass, WebDriverFactory webDriverFactory, Configuration configuration, BatchManager batchManager) throws InitializationError {
        super(klass, webDriverFactory, configuration, batchManager);
    }

    public JUnitRunner(Class<?> klass, BatchManager batchManager) throws InitializationError {
        super(klass, batchManager);
    }

    public JUnitRunner(Class<?> klass, WebdriverManager webDriverManager, Configuration configuration, BatchManager batchManager) throws InitializationError {
        super(klass, webDriverManager, configuration, batchManager);
    }

    @Override
    public void run(RunNotifier notifier) {
        notifier.addListener(new JUnitListener());
        super.run(notifier);

    }

}
