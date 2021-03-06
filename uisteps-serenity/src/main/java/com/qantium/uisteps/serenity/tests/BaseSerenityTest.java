/*
 * Copyright 2016 ASolyankin.
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
package com.qantium.uisteps.serenity.tests;

import com.qantium.uisteps.core.tests.BaseTest;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.storage.Storage;
import com.qantium.uisteps.serenity.verify.Assume;
import com.qantium.uisteps.serenity.verify.Verify;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

/**
 *
 * @author Anton Solyankin
 */
@RunWith(SerenityRunner.class)
public class BaseSerenityTest extends BaseTest {

    @Override
    protected Verify getAssertions() {
        return SerenityUtils.getNewStepLibrary(Verify.class);
    }

    @Override
    protected Assume getAssumtions() {
        return SerenityUtils.getNewStepLibrary(Assume.class);
    }

    @Override
    protected Storage getStorage() {
        return SerenityUtils.getNewStepLibrary(Storage.class);
    }

}
