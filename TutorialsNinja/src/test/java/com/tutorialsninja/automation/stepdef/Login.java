package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login {

    HeadersSection headersSection = new HeadersSection();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Given("I navigate to Account Login page")
    public void i_navigate_to_account_login_page() {

        Elements.click(headersSection.myAccountLink);
        Elements.click(headersSection.login);
    }
    @When("I enter Username {string} and Password {string}")
    public void i_enter_username_and_password(String string, String string2) {
      loginPage.detailsLogin(string, string2);
    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        Elements.click(loginPage.loginButton);
    }
    @Then("I should be able login successfully")
    public void i_should_be_able_login_successfully() {

        Assert.assertTrue(Elements.isDisplayed(myAccountPage.myAccountBread));
    }
}
