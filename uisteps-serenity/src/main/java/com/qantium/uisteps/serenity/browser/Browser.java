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

import com.qantium.uisteps.core.browser.pages.Page;
import com.qantium.uisteps.serenity.SerenityUtils;
import com.qantium.uisteps.core.browser.pages.UIObject;
import com.qantium.uisteps.core.browser.pages.elements.CheckBox;
import com.qantium.uisteps.core.browser.pages.elements.FileInput;
import com.qantium.uisteps.core.browser.pages.elements.RadioButtonGroup.RadioButton;
import com.qantium.uisteps.core.browser.pages.elements.Select.Option;
import com.qantium.uisteps.core.browser.pages.elements.Select;
import com.qantium.uisteps.serenity.ProxyWebDriverFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.WrapsElement;

/**
 *
 * @author ASolyankin
 */
public class Browser extends com.qantium.uisteps.core.browser.Browser {

    @Override
    public WebDriver getDriver() {
        return ((ProxyWebDriverFacade) super.getDriver()).getProxiedDriver();
    }

    @Step("Open \"{0}\"")
    protected void open(Page page) {
        super.open(page);
    }

    @Step
    @Override
    public void deleteAllCookies() {
        super.deleteAllCookies();
    }

    @Step
    @Override
    public void deleteCookieNamed(String name) {
        super.deleteCookieNamed(name);
    }

    @Step
    @Override
    public void refreshCurrentPage() {
        super.refreshCurrentPage();
    }

    @Step("On displayed \"{0}\"")
    @Override
    public <T extends UIObject> T onDisplayed(T uiObject) {
        return super.onDisplayed(uiObject);
    }

    //Window
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

    //Window position
    @Step("Set window position to point ({0}; {1})")
    @Override
    public void setWindowPosition(int newX, int newY) {
        super.setWindowPosition(newX, newY);
    }

    @Step("Move window with offset ({0}; {1})")
    @Override
    public void moveWindowBy(int xOffset, int yOffset) {
        super.moveWindowBy(xOffset, yOffset);
    }

    @Step("Move window to point ({0}; {1})")
    @Override
    public void moveWindowTo(int newX, int newY) {
        super.moveWindowTo(newX, newY);
    }

    @Step
    @Override
    public void maximizeWindow() {
        super.maximizeWindow();
    }

    //Window size
    @Step("Set window size to {0} x {1}")
    @Override
    public void setWindowSize(int width, int height) {
        super.setWindowSize(width, height);
    }

    @Step("Set window width to {0}")
    @Override
    public void setWindowWidth(int width) {
        getDriver().manage().window().setSize(new Dimension(width, getWindowSize().getHeight()));
        super.setWindowWidth(width);
    }

    @Step("Set window height to {0}")
    @Override
    public void setWindowHeight(int height) {
        super.setWindowHeight(height);
    }

    //Elements
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
    @Step("Enter into \"{0}\" value \"{1}\"")
    public void enterInto(WrapsElement input, String text) {
        super.enterInto(input, text);
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
    public void click() {
        super.click();
    }

    @Step
    @Override
    public void clickAndHold() {
        super.clickAndHold();
    }

    @Override
    @Step("Click and hold on \"{0}\"")
    public void clickAndHold(WrapsElement element) {
        super.clickAndHold(element);
    }

    @Step
    @Override
    public void doubleClick() {
        super.doubleClick();
    }

    @Step("Double click on \"{0}\"")
    @Override
    public void doubleClick(WrapsElement element) {
        super.doubleClick(element);
    }

    @Step("Double and drop \"{0}\" to \"{1}\"")
    @Override
    public void dragAndDrop(WrapsElement source, WrapsElement target) {
        super.dragAndDrop(source, target);
    }

    @Step("Double and drop \"{0}\" with offset ({1}; {2})")
    @Override
    public void dragAndDrop(WrapsElement element, int xOffset, int yOffset) {
        super.dragAndDrop(element, xOffset, yOffset);
    }

    @Step("Press the key \"{0}\"")
    @Override
    public void keyDown(Keys theKey) {
        super.keyDown(theKey);
    }

    @Step("Click \"{0}\" and press the key \"{1}\"")
    @Override
    public void keyDown(WrapsElement element, Keys theKey) {
        super.keyDown(element, theKey);
    }

    @Step("Lift the key \"{0}\"")
    @Override
    public void keyUp(Keys theKey) {
        super.keyUp(theKey);
    }

    @Step("Click \"{0}\" and lift the key \"{1}\"")
    @Override
    public void keyUp(WrapsElement element, Keys theKey) {
        super.keyUp(element, theKey);
    }

    @Step("Move mouse with offset ({0}; {1})")
    @Override
    public void moveMouseByOffset(int xOffset, int yOffset) {
        super.moveMouseByOffset(xOffset, yOffset);
    }

    @Step("Move mouse to \"{0}\" with offset ({1}; {2})")
    @Override
    public void moveToElement(WrapsElement element, int xOffset, int yOffset) {
        super.moveToElement(element, xOffset, yOffset);
    }

    @Step("Move mouse over \"{0}\"")
    @Override
    public void moveMouseOver(WrapsElement element) {
        super.moveMouseOver(element);
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
        super.select(checkBox);
    }

    @Step("Deselect \"{0}\"")
    @Override
    public void deselect(CheckBox checkBox) {
        super.deselect(checkBox);
    }

    //FileInput
    @Step("Set to \"{0}\" file \"{1}\"")
    @Override
    public void setTo(FileInput fileInput, String filePath) {
        super.setTo(fileInput, filePath);
    }

    @Override
    public <T extends UIObject> T instatiate(Class<T> uiObject) {
        return SerenityUtils.getNewStepLibrary(uiObject);

    }
}
