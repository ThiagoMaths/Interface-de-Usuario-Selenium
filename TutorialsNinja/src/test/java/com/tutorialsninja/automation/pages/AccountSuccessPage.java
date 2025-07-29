package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.framework.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {

    WebDriver driver;

    public AccountSuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Success")
    public WebElement successBread;

    public boolean isCreatedRegister() {

        boolean isDisplayed = Elements.isDisplayed(driver, successBread);
        return isDisplayed;
    }
}
