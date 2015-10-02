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

import com.qantium.uisteps.core.browser.pages.UIBlock;
import com.qantium.uisteps.core.browser.pages.UIElement;
import com.qantium.uisteps.core.browser.pages.UIObject;
import com.qantium.uisteps.serenity.SerenityUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.reflect.ConstructorUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.FindBy;
/**
 *
 * @author ASolyankin
 */
public class UIObjectFactory implements com.qantium.uisteps.core.browser.pages.UIObjectFactory {

    @Override
    public <T extends UIObject> T instatiate(Class<T> uiObject) {
        return new SerenityUtils().getNewStepLibrary(uiObject);
    }
    
    @Override
    public <T extends WrapsElement> T instatiate(Class<T> uiObject, WebElement wrappedElement)  {
        
        if(UIBlock.class.isAssignableFrom(uiObject)) {
            
            T uiObjectInstance = new SerenityUtils().getNewStepLibrary(uiObject);
            ((UIBlock) uiObjectInstance).setWrappedElement(wrappedElement);
            return uiObjectInstance;
            
        } 
        
        if(UIElement.class.isAssignableFrom(uiObject)) {
            
            try {
                return (T) ConstructorUtils.invokeConstructor(uiObject, wrappedElement);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ex) {
                throw new RuntimeException("Cannot instantiate " + uiObject + " with parameter " + wrappedElement + ".\nCause: " + ex);
            }
        }
        
        throw new RuntimeException("Cannot instantiate! " + uiObject + " is not assignable from UIBlock or UIElement!");
    }
}
