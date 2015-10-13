
/*
 * Copyright 2014 ASolyankin.
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
package com.qantium.uisteps.serenity.browser.pages;

import com.qantium.uisteps.core.browser.Browser;
import com.qantium.uisteps.core.browser.pages.Url;
import com.qantium.uisteps.serenity.SerenityUtils;

/**
 *
 * @author ASolyankin
 */
public class Page extends com.qantium.uisteps.core.browser.pages.Page {

    public Page() {
        super(new UrlFactory());
    }

    public Page(com.qantium.uisteps.core.browser.pages.UrlFactory urlFactory, String name) {
        super(urlFactory, name);
    }

    public Page(com.qantium.uisteps.core.browser.pages.UrlFactory urlFactory) {
        super(urlFactory);
    }

    public Page(Url url, String name) {
        super(url, name);
    }

    public Page(Url url) {
        super(url);
    }

    @Override
    public Browser inOpenedBrowser() {
        return SerenityUtils.getCurrentBrowser();
    }
}
