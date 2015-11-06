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
package com.qantium.uisteps.serenity.run.tests;

import com.qantium.uisteps.core.run.tests.JUnitTest;
import com.qantium.uisteps.serenity.run.storage.Storage;
import com.qantium.uisteps.serenity.run.verify.Verify;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.run.verify.Assume;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author ASolyankin
 */
@RunWith(JUnitSerenityRunner.class)
public class JUnitSerenityTest extends JUnitTest {

    @Managed
    WebDriver driver;

    public JUnitSerenityTest() {

        super(
                SerenityUtils.getNewStepLibrary(Verify.class),
                SerenityUtils.getNewStepLibrary(Assume.class),
                SerenityUtils.getNewStepLibrary(Storage.class)
        );
    }
}
