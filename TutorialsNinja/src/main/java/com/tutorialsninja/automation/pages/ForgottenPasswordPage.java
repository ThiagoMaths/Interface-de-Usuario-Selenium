package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class ForgottenPasswordPage {

    public ForgottenPasswordPage() {
        PageFactory.initElements(Base.driver, this);

    }

    @FindBy(id = "input-email")
    public WebElement email;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

}
