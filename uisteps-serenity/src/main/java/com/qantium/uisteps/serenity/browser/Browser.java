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
import com.qantium.uisteps.core.browser.pages.UIElement;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.core.browser.pages.UIObject;
import com.qantium.uisteps.core.browser.pages.elements.CheckBox;
import com.qantium.uisteps.core.browser.pages.elements.FileInput;
import com.qantium.uisteps.core.browser.pages.elements.RadioButtonGroup.RadioButton;
import com.qantium.uisteps.core.browser.pages.elements.Select.Option;
import com.qantium.uisteps.core.browser.pages.elements.Select;
import com.qantium.uisteps.serenity.ProxyWebDriverFacade;
import net.thucydides.core.annotations.Step;
import org.apache.maven.shared.utils.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.WrapsElement;

/**
 *
 * @author ASolyankin
 */
public class Browser extends com.qantium.uisteps.core.browser.Browser {

    private String name;

    @Override
    public WebDriver getDriver() {
        return ((ProxyWebDriverFacade) super.getDriver()).getProxiedDriver();
    }
    
    public Browser() {
        super(SerenityUtils.getCurrentDriver());
    }

    public Browser(WebDriver driver) {
        super(driver);
    }

    public String getName() {

        if (StringUtils.isEmpty(name)) {
            name = ((ProxyWebDriverFacade) super.getDriver()).getDriverName();
        }
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

    @Override
    @Step("Enter into \"{0}\" value \"{1}\"")
    public void enterInto(WrapsElement input, String text) {
        super.enterInto(input, text);
    }

    @Step
    @Override
    public void clear(WrapsElement input) {
        super.clear(input);
    }

    @Override
    @Step("Type into \"{0}\" value \"{1}\"")
    public void typeInto(WrapsElement input, String text) {
        super.typeInto(input, text);
    }

    @Override
    @Step("Click \"{0}\" on point ({1};{2})")
    public void clickOnPoint(WrapsElement element, int x, int y) {
        super.clickOnPoint(element, x, y);
    }

    @Step("Click \"{0}\"")
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

    @Step("Open \"{0}\"")
    @Override
    protected void open(MockPage page) {
        super.open(page);
    }

    @Step("On displayed \"{0}\"")
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
    @Step("Select \"{0}\"")
    @Override
    public void select(Option option) {
        super.select(option);
    }

    @Step("Deselect ol values from \"{0}\"")
    @Override
    public void deselectAllValuesFrom(Select select) {
        super.deselectAllValuesFrom(select);
    }

    @Step("Deselect \"{0}\"")
    @Override
    public void deselect(Option option) {
        super.deselect(option);
    }

    //Radio button
    @Step("Select \"{0}\"")
    @Override
    public void select(RadioButton button) {
        super.select(button);
    }

    //CheckBox
    @Step("Select \"{0}\"")
    @Override
    public void select(CheckBox checkBox) {
        checkBox.getWrappedCheckBox().select();
    }

    @Step("Deselect \"{0}\"")
    @Override
    public void deselect(CheckBox checkBox) {
        checkBox.getWrappedCheckBox().deselect();
    }

    //FileInput
    @Step("Set to \"{0}\" file \"{1}\"")
    @Override
    public void setTo(FileInput fileInput, String filePath) {
        fileInput.getWrappedFileInput().setFileToUpload(filePath);
    }

    @Override
    public <T extends UIObject> T instatiate(Class<T> uiObject) {
        
        if(UIElement.class.isAssignableFrom(uiObject)) {
            return super.instatiate(uiObject);
        } else {
            return SerenityUtils.getNewStepLibrary(uiObject);
        }
    }
}
