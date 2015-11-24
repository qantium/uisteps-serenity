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
package com.qantium.uisteps.serenity.stories;

import com.qantium.uisteps.serenity.storage.Storage;
import com.qantium.uisteps.serenity.verify.Verify;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.verify.Assume;
import net.serenitybdd.jbehave.SerenityStory;

/**
 *
 * @author ASolyankin
 */
public class Story extends SerenityStory {

    public final Verify verify;
    public final Assume assume;
    public final Storage storage;

    public Story() {
        this(new StoryListener());
    }

    public Story(StoryListener listener) {
        this.verify = SerenityUtils.getNewStepLibrary(Verify.class);
        this.assume = SerenityUtils.getNewStepLibrary(Assume.class);
        this.storage = SerenityUtils.getNewStepLibrary(Storage.class);
        listener.register();
    }
}
