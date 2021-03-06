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
package com.qantium.uisteps.serenity.stories;

import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.user.User;

/**
 *
 * @author A.Solyankin
 * @param <U> specifies the type of user
 */
public class BaseUserStory <U extends User> extends Story {
    
    public final U user;

    public BaseUserStory(Class<U> user) {
        this(new StoryListener(), user);
    }

    public BaseUserStory(StoryListener listener, Class<U> user) {
        super(listener);
        this.user = SerenityUtils.getNewStepLibrary(user);
    }
}
