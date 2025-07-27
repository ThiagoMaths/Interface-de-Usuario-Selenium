package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.framework.Elements;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.tutorialsninja.automation.base.Base.driver;

public class LoginPage {

    HeadersSection headersSection = new HeadersSection();

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

    public void clickLoginButton() {
        Elements.click(driver, loginButton);
    }

    public void isMainWarningDisplayed(){
        Assert.assertTrue(Elements.isDisplayed(driver, mainWarning));
    }

    public void clickForgottenLink() {
        Elements.click(driver, forgottenLink);
    }

    public void isPasswordResetEmailSent(){
        Assert.assertTrue(Elements.VerifyTextEquals(mainWarning, "An email with a confirmation link has been sent your email address."));

    }
}
