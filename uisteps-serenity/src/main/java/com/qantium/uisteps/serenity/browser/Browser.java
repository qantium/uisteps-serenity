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
import com.qantium.uisteps.core.browser.pages.UIObject;
import com.qantium.uisteps.core.browser.pages.elements.CheckBox;
import com.qantium.uisteps.core.browser.pages.elements.FileInput;
import com.qantium.uisteps.core.browser.pages.elements.RadioButtonGroup.RadioButton;
import com.qantium.uisteps.core.browser.pages.elements.Select.Option;
import com.qantium.uisteps.core.browser.pages.elements.Select;
import com.qantium.uisteps.serenity.ProxyWebDriverFacade;
import net.thucydides.core.annotations.Step;
import org.apache.maven.shared.utils.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.internal.WrapsElement;

/**
 *
 * @author ASolyankin
 */
public class Browser extends com.qantium.uisteps.core.browser.Browser {

    private String name;

    public String getName() {

        if (StringUtils.isEmpty(name)) {
            name = ((ProxyWebDriverFacade) super.getDriver()).getDriverName();
        }
        return name;
    }

    @Override
    public Browser open() {
        return open(this);
    }

    @Step
    protected Browser open(com.qantium.uisteps.core.browser.Browser browser) {
        return super.open();
    }

    @Step
    protected Browser open(MockPage page) {
        return super.open(page);
    }

    @Step
    @Override
    public Browser deleteAllCookies() {
        return super.deleteAllCookies();
    }

    @Step
    @Override
    public Browser deleteCookieNamed(String name) {
        return super.deleteCookieNamed(name);
    }

    @Step
    @Override
    public Browser refreshCurrentPage() {
        return super.refreshCurrentPage();
    }

    @Step("On displayed \"{0}\"")
    @Override
    public <T extends UIObject> T onDisplayed(T uiObject) {
        return super.onDisplayed(uiObject);
    }

    //Window
    @Step
    @Override
    public Browser openNewWindow() {
        return super.openNewWindow();
    }

    @Step
    @Override
    public Browser switchToWindowByIndex(int index) {
        return super.switchToWindowByIndex(index);
    }

    @Step
    @Override
    public Browser switchToDefaultWindow() {
        return super.switchToDefaultWindow();
    }

    @Step
    @Override
    public Browser switchToPreviousWindow() {
        return super.switchToPreviousWindow();
    }

    @Step
    @Override
    public Browser switchToNextWindow() {
        return super.switchToNextWindow();
    }

    //Window position

    @Step("Set window position to point ({0}; {1})")
    @Override
    public Browser setWindowPosition(int newX, int newY) {
        return super.setWindowPosition(newX, newY);
    }

    @Step("Move window with offset ({0}; {1})")
    @Override
    public Browser moveWindowBy(int xOffset, int yOffset) {
        return super.moveWindowBy(xOffset, yOffset);
    }

    @Step("Move window to point ({0}; {1})")
    @Override
    public Browser moveWindowTo(int newX, int newY) {
        return super.moveWindowTo(newX, newY);
    }

    @Step
    @Override
    public Browser maximizeWindow() {
        return super.maximizeWindow();
    }

    //Window size
    @Step("Set window size to {0} x {1}")
    @Override
    public Browser setWindowSize(int width, int height) {
        return super.setWindowSize(width, height);
    }

    @Step("Set window width to {0}")
    @Override
    public Browser setWindowWidth(int width) {
        getDriver().manage().window().setSize(new Dimension(width, getWindowSize().getHeight()));
        return super.setWindowWidth(width);
    }

    @Step("Set window height to {0}")
    @Override
    public Browser setWindowHeight(int height) {
        return super.setWindowHeight(height);
    }

    //Elements
    @Step
    @Override
    public Browser clear(WrapsElement input) {
        return super.clear(input);
    }

    @Override
    @Step("Type into \"{0}\" value \"{1}\"")
    public Browser typeInto(WrapsElement input, String text) {
        return super.typeInto(input, text);
    }

    @Override
    @Step("Enter into \"{0}\" value \"{1}\"")
    public Browser enterInto(WrapsElement input, String text) {
        return super.enterInto(input, text);
    }

    @Override
    @Step("Click \"{0}\" on point ({1};{2})")
    public Browser clickOnPoint(WrapsElement element, int x, int y) {
        return super.clickOnPoint(element, x, y);
    }

    @Step("Click \"{0}\"")
    @Override
    public Browser click(WrapsElement element) {
        return super.click(element);
    }

    @Step
    @Override
    public Browser click() {
        return super.click();
    }

    @Step
    @Override
    public Browser clickAndHold() {
        return super.clickAndHold();
    }

    @Override
    @Step("Click and hold on \"{0}\"")
    public Browser clickAndHold(WrapsElement element) {
        return super.clickAndHold(element);
    }

    @Step
    @Override
    public Browser doubleClick() {
        return super.doubleClick();
    }

    @Step("Double click on \"{0}\"")
    @Override
    public Browser doubleClick(WrapsElement element) {
        return super.doubleClick(element);
    }

    @Step("Double and drop \"{0}\" to \"{1}\"")
    @Override
    public Browser dragAndDrop(WrapsElement source, WrapsElement target) {
        return super.dragAndDrop(source, target);
    }

    @Step("Double and drop \"{0}\" with offset ({1}; {2})")
    @Override
    public Browser dragAndDrop(WrapsElement element, int xOffset, int yOffset) {
        return super.dragAndDrop(element, xOffset, yOffset);
    }

    @Step("Press the key \"{0}\"")
    @Override
    public <T extends com.qantium.uisteps.core.browser.Browser> T keyDown(Keys theKey) {
        return super.keyDown(theKey);
    }

    @Step("Click \"{0}\" and press the key \"{1}\"")
    @Override
    public Browser keyDown(WrapsElement element, Keys theKey) {
        return super.keyDown(element, theKey);
    }

    @Step("Lift the key \"{0}\"")
    @Override
    public Browser keyUp(Keys theKey) {
        return super.keyUp(theKey);
    }

    @Step("Click \"{0}\" and lift the key \"{1}\"")
    @Override
    public Browser keyUp(WrapsElement element, Keys theKey) {
        return super.keyUp(element, theKey);
    }

    @Step("Move mouse with offset ({0}; {1})")
    @Override
    public <T extends com.qantium.uisteps.core.browser.Browser> T moveMouseByOffset(int xOffset, int yOffset) {
        return super.moveMouseByOffset(xOffset, yOffset);
    }

    @Step("Move mouse to \"{0}\" with offset ({1}; {2})")
    @Override
    public Browser moveToElement(WrapsElement element, int xOffset, int yOffset) {
        return super.moveToElement(element, xOffset, yOffset);
    }

    @Step("Move mouse over \"{0}\"")
    @Override
    public Browser moveMouseOver(WrapsElement element) {
        return super.moveMouseOver(element);
    }

    //Select
    @Step("Select \"{0}\"")
    @Override
    public Browser select(Option option) {
        return super.select(option);
    }

    @Step("Deselect ol values from \"{0}\"")
    @Override
    public Browser deselectAllValuesFrom(Select select) {
        return super.deselectAllValuesFrom(select);
    }

    @Step("Deselect \"{0}\"")
    @Override
    public Browser deselect(Option option) {
        return super.deselect(option);
    }

    //Radio button
    @Step("Select \"{0}\"")
    @Override
    public Browser select(RadioButton button) {
        return super.select(button);
    }

    //CheckBox
    @Step("Select \"{0}\"")
    @Override
    public Browser select(CheckBox checkBox) {
        return super.select(checkBox);
    }

    @Step("Deselect \"{0}\"")
    @Override
    public Browser deselect(CheckBox checkBox) {
        return super.deselect(checkBox);
    }

    //FileInput
    @Step("Set to \"{0}\" file \"{1}\"")
    @Override
    public Browser setTo(FileInput fileInput, String filePath) {
        return super.setTo(fileInput, filePath);
    }

    @Override
    public <T extends UIObject> T instatiate(Class<T> uiObject) {
        return SerenityUtils.getNewStepLibrary(uiObject);

    }
}
