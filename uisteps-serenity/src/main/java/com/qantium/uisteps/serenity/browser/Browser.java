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
package com.qantium.uisteps.serenity.browser;

import com.qantium.uisteps.core.browser.pages.MockPage;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.core.browser.pages.UIObjectInitializer;
import com.qantium.uisteps.serenity.browser.pages.UIObjectFactory;
import com.qantium.uisteps.core.browser.pages.UIObject;
import com.qantium.uisteps.core.browser.pages.elements.CheckBox;
import com.qantium.uisteps.core.browser.pages.elements.FileInput;
import com.qantium.uisteps.core.browser.pages.elements.RadioButtonGroup.RadioButton;
import com.qantium.uisteps.core.browser.pages.elements.Select.Option;
import com.qantium.uisteps.core.browser.pages.elements.Select;
import com.qantium.uisteps.serenity.ProxyWebDriverFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.WrapsElement;

/**
 *
 * @author ASolyankin
 */
public class Browser extends com.qantium.uisteps.core.browser.Browser {
    
    private final String name;
    
    public Browser() {
        this(SerenityUtils.getCurrentDriver(),  new UIObjectFactory(), new UIObjectInitializer(SerenityUtils.getCurrentDriver()));
    }

    public Browser(WebDriver driver, com.qantium.uisteps.core.browser.pages.UIObjectFactory uiObjectFactory, UIObjectInitializer initializer) {
        super(driver, uiObjectFactory, initializer);
        name = ((ProxyWebDriverFacade) SerenityUtils.getCurrentDriver()).getDriverName();
    }

    public String getName() {
        return name;
    }

    @Override
    public com.qantium.uisteps.core.browser.Browser open() {
        return open(this); 
    }
    
    @Step
    protected com.qantium.uisteps.core.browser.Browser open(com.qantium.uisteps.core.browser.Browser browser) {
        return super.open();
    }
    
    @Step
    @Override
    public void enterInto(WrapsElement input, String text) {
        super.enterInto(input, text);
    }

    @Step
    @Override
    public void clear(WrapsElement input) {
        super.clear(input);
    }

    @Step
    @Override
    public void typeInto(WrapsElement input, String text) {
        super.typeInto(input, text);
    }

    @Step
    @Override
    public void clickOnPoint(WrapsElement element, int x, int y) {
        super.clickOnPoint(element, x, y);
    }

    @Step
    @Override
    public void click(WrapsElement element) {
        super.click(element);
    }

    @Step
    @Override
    public void deleteCookies() {
        super.deleteCookies();
    }

    @Step
    @Override
    public void refreshCurrentPage() {
        super.refreshCurrentPage();
    }

    @Step
    @Override
    protected void open(MockPage page) {
        super.open(page);
    }

    @Step
    @Override
    public <T extends UIObject> T onDisplayed(T uiObject) {
        return super.onDisplayed(uiObject);
    }

    @Step
    @Override
    public void openNewWindow() {
        super.openNewWindow();
    }

    @Step
    @Override
    public void switchToWindowByIndex(int index) {
        super.switchToWindowByIndex(index);
    }

    @Step
    @Override
    public void switchToDefaultWindow() {
        super.switchToDefaultWindow();
    }

    @Step
    @Override
    public void switchToPreviousWindow() {
        super.switchToPreviousWindow();
    }

    @Step
    @Override
    public void switchToNextWindow() {
        super.switchToNextWindow();
    }

    //Select
    @Step
    @Override
    public void select(Option option) {
        super.select(option);
    }

    @Step
    @Override
    public void deselectAllValuesFrom(Select select) {
        super.deselectAllValuesFrom(select);
    }

    @Step
    @Override
    public void deselect(Option option) {
        super.deselect(option);
    }

    //Radio button
    @Step
    @Override
    public void select(RadioButton button) {
        super.select(button);
    }

    //CheckBox
    @Step
    @Override
    public void select(CheckBox checkBox) {
        checkBox.getWrappedCheckBox().select();
    }

    @Step
    @Override
    public void deselect(CheckBox checkBox) {
        checkBox.getWrappedCheckBox().deselect();
    }

    //FileInput
    @Step
    @Override
    public void setTo(FileInput fileInput, String filePath) {
        fileInput.getWrappedFileInput().setFileToUpload(filePath);
    }
}
