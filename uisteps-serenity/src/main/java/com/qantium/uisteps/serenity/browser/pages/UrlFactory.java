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
package com.qantium.uisteps.serenity.browser.pages;

import com.qantium.uisteps.serenity.SerenityUtils;
import java.lang.annotation.Annotation;

/**
 *
 * @author A.Solyankin
 */
public class UrlFactory extends com.qantium.uisteps.thucydides.browser.pages.UrlFactory {

    public UrlFactory() {
        super();
    }

    public UrlFactory(String host, Class<? extends Annotation> urlAnnotation) {
        super(host, urlAnnotation);
    }

    @Override
    protected String getBaseUrl() {
        return new SerenityUtils().getBaseUrl();
    }

}
