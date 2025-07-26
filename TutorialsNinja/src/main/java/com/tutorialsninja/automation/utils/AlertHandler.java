package com.tutorialsninja.automation.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertHandler {

    private WebDriver driver;

    public AlertHandler(WebDriver driver) {
        this.driver = driver;
    }

    public Alert getAlert() {
        return driver.switchTo().alert();
    }

    public void AcceptAlert() {
        getAlert().accept();
    }

    public void DismissAlert() {
        getAlert().dismiss();
    }

    public String getAlertText() {
        return getAlert().getText();
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void AcceptAlertIfPresent() {
        if (!isAlertPresent()){
            AcceptAlert();
        }
    }

    public void DismissAlertIfPresent() {

        if (!isAlertPresent()){
            DismissAlert();
        }
    }

    public void AcceptPrompt(String text) {

        if (!isAlertPresent()){
            Alert alert = getAlert();
            alert.sendKeys(text);
            alert.accept();
        }


    }
}
