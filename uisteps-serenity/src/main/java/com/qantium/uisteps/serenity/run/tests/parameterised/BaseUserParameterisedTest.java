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
package com.qantium.uisteps.serenity.run.tests.parameterised;

import com.qantium.uisteps.serenity.run.tests.BaseUserTest;
import org.junit.runner.RunWith;

/**
 *
 * @author A.Solyankin
 */
@RunWith(JUnitParameterizedRunner.class)
public class BaseUserParameterisedTest<U> extends BaseUserTest {

    public BaseUserParameterisedTest(Class<U> user) {
        super(user);
    }
}