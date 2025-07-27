package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.framework.Elements;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class RegisterPage {

    WebDriver driver;

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

    public void privacyPolicySelect(){
        Elements.click(driver, privacyPolity);
    }

    public void clickContinueButton(){
        Elements.click(driver, continueButton);

    }
    public boolean registerNoCreated(){
        boolean isDisplayed = Elements.isDisplayed(driver, registerBreadCrumb);
        return isDisplayed;

    }
    public void WarningAlert(){
        List<WebElement> warningElements = Arrays.asList(
               firsNameWarning,
               lastNameWarning,
                emailWarning,
               telephoneWarning,
                passwordWarning,
               mainWarning
        );

        List<String> warningMessages = Arrays.asList(
                "First name error message not displayed",
                "Last name error message not displayed",
                "Email error message not displayed",
                "Phone number error message not displayed",
                "Password error message not displayed",
                "General error message not displayed"
        );

        for (int i = 0; i < warningElements.size(); i++) {
            Assert.assertTrue(warningMessages.get(i), Elements.isDisplayed(driver, warningElements.get(i)));
        }
    }

    public void subscribe(){
        Elements.selectRadioButton(subscribeButton);

    }

    public boolean duplicateAccount(){
      boolean isDisplayed = Elements.isDisplayed(driver, dangerWarning);
      return isDisplayed;
    }
}
