package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.tutorialsninja.automation.base.Base.driver;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "input-email")
    public WebElement emailField;

    @FindBy(id = "input-password")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginButton;

    @FindBy(css = "div[class$='alert-dismissible']")
    public WebElement mainWarning;

    @FindBy(linkText = "Forgotten Password")
    public WebElement forgottenLink;

    public void detailsLogin(String string, String string2) {

        Elements.TypeText(driver, emailField, string);
        Elements.TypeText(driver, passwordField, string2);
    }
}
