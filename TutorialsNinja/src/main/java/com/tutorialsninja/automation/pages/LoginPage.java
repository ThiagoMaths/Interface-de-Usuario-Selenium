package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Base.driver, this);
    }

    @FindBy(id = "input-email")
    public static WebElement emailField;

    @FindBy(id = "input-password")
    public static WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    public static WebElement loginButton;

    public static void detailsLogin( String string, String string2) {

        Elements.TypeText(LoginPage.emailField, string);
        Elements.TypeText(LoginPage.passwordField, string2);
    }
}
