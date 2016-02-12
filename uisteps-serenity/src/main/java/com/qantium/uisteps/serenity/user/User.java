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
package com.qantium.uisteps.serenity.user;

import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.serenity.browser.BrowserManager;

/**
 * @author ASolyankin
 */
public class User extends com.qantium.uisteps.core.user.User {

    @Override
    protected void setBrowserManager() {
        setBrowserManager(SerenityUtils.getNewStepLibrary(BrowserManager.class));
    }

}
