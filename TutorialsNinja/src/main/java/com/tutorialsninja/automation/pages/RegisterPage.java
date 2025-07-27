package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

import static com.tutorialsninja.automation.base.Base.driver;

public class RegisterPage {

    public RegisterPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "input-firstname")
    public WebElement firstName;

    @FindBy(id = "input-lastname")
    public WebElement lastName;

    @FindBy(id = "input-email")
    public WebElement email;

    @FindBy(id = "input-telephone")
    public WebElement telephone;

    @FindBy(id = "input-password")
    public WebElement password;

    @FindBy(id = "input-confirm")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElement privacyPolity;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(linkText = "Register")
    public WebElement registerBreadCrumb;

    @FindBy(css = "input[id='input-firstname']+div")
    public WebElement firsNameWarning;

    @FindBy(css = "input[id='input-lastname']+div")
    public WebElement lastNameWarning;

    @FindBy(css = "input[id='input-email']+div")
    public WebElement emailWarning;

    @FindBy(css = "input[id='input-telephone']+div")
    public WebElement telephoneWarning;

    @FindBy(css = "input[id='input-password']+div")
    public WebElement passwordWarning;

    @FindBy(css = "div[class$='alert-dismissible']")
    public WebElement mainWarning;

    @FindBy(xpath = "(//input[@name='newsletter'])[1]")
    public WebElement subscribeButton;

    @FindBy(xpath = "(//div[@class='alert alert-danger alert-dismissible'])[1]")
    public WebElement dangerWarning;

    public void enterAllDetails(DataTable dataTable) {

        Map<String, String> map = dataTable.asMap(String.class, String.class);
        Elements.TypeText(driver ,firstName, map.get("FirstName"));
        Elements.TypeText(driver, lastName, map.get("LastName"));
        Elements.TypeText(driver, email, map.get("Email"));
        Elements.TypeText(driver, telephone, map.get("Telephone"));
        Elements.TypeText(driver,password, map.get("Password"));
        Elements.TypeText(driver, confirmPassword, map.get("Password"));

    }
}
