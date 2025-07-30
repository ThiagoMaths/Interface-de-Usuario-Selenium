package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.framework.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeadersSection {

    WebDriver driver;
    public HeadersSection(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()=\"My Account\"]")
    public WebElement myAccountLink;

    @FindBy(linkText = "Register")
    public WebElement register;

    @FindBy(linkText = "Login")
    public WebElement login;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchField;

    @FindBy(css = "button[class*='btn-lg']")
    public WebElement buttonSearch;

    public void myAccountToRegister() {
        Elements.click(driver, myAccountLink);
        Elements.click(driver, register);
    }

}
