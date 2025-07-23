package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSucessPage {

    public AccountSucessPage() {

        PageFactory.initElements(Base.driver, this);
    }

    @FindBy(linkText = "Success")
    public static WebElement successBread;
}
