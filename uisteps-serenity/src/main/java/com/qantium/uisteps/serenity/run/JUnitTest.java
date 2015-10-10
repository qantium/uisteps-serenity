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
package com.qantium.uisteps.serenity.run;

import com.qantium.uisteps.core.Named;
import com.qantium.uisteps.serenity.run.storage.Storage;
import com.qantium.uisteps.serenity.run.verify.Verify;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.run.verify.Assume;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

/**
 *
 * @author ASolyankin
 */
@RunWith(SerenityRunner.class)
public class JUnitTest {

    public final Verify verify;
    public final Assume assume;
    public final Storage storage;

    public JUnitTest() {
        this(new Listener());
    }

    public JUnitTest(Listener listener) {
        this.verify = SerenityUtils.getNewStepLibrary(Verify.class);
        this.assume = SerenityUtils.getNewStepLibrary(Assume.class);
        this.storage = SerenityUtils.getNewStepLibrary(Storage.class);
        listener.register();
    }

    public <T> T remember(String key, T value) {
        return storage.remember(key, value);
    }

    public <T extends Named> T remember(T value) {
        return storage.remember(value);
    }

    public <T> T remember(T value) {
        return storage.remember(value);
    }

    public <T> T remembered(String key) {
        return storage.remembered(key);
    }

    public <T> T remembered(Class<T> key) {
        return storage.remembered(key);
    }
}
