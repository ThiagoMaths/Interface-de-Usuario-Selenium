package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadersSection {

    public HeadersSection() {
        PageFactory.initElements(Base.driver, this);
    }

    @FindBy(xpath = "//span[text()=\"My Account\"]")
    public static WebElement myAccountLink;

    @FindBy(linkText = "Register")
    public static WebElement register;

    @FindBy(linkText = "Login")
    public static WebElement login;

}
