package com.tutorialsninja.automation.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {

    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(arguments[0],arguments[1])",
                element.getLocation().x, element.getLocation().y);
    }

    public static void scrollToElementAndClick(WebDriver driver, WebElement element) {
        scrollToElement(driver, element);
        element.click();
    }

    public static void scrollIntoView(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView()", element);
    }

    public static void scrollIntoViewAndClick(WebDriver driver, WebElement element) {
        scrollIntoView(driver, element);
        element.click();
    }

    public static void scrollDownVertically(WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollUpVertically(WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
    }

    public static void scrollDownByPixel(WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollBy(0,1500)");
    }

    public static void scrollUpByPixel(WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollBy(0,-1500)");
    }

    public static void ZoomInByPercentage(WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("document.body.style.zoom='40%'");
    }

    public static void ZoomBy100Percentage(WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("document.body.style.zoom='100%'");
    }
}
