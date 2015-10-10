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
package com.qantium.uisteps.serenity.run;

import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.user.User;

/**
 *
 * @author A.Solyankin
 * @param <U>
 */
public class BaseUserTest<U extends User> extends JUnitTest {
    
    public final U user;

    public BaseUserTest(Class<U> user) {
        this(new Listener(), user);
    }

    public BaseUserTest(Listener listener, Class<U> user) {
        super(listener);
        this.user = SerenityUtils.getNewStepLibrary(user);
    }
}