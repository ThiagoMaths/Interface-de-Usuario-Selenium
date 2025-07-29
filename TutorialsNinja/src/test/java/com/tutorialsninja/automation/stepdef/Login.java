package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgottenPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.tutorialsninja.automation.base.Base.driver;

public class Login {

    HeadersSection headersSection = new HeadersSection();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage();

    @Given("I navigate to Account Login page")
    public void i_navigate_to_account_login_page() {

        Elements.click(driver, headersSection.myAccountLink);
        Elements.click(driver, headersSection.login);
    }

    @When("I enter Username {string} and Password {string}")
    public void i_enter_username_and_password(String string, String string2) {
        loginPage.detailsLogin(string, string2);
    }

    @When("I click on Login button")
    public void i_click_on_login_button() {
        Elements.click(driver, loginPage.loginButton);
    }

    @Then("I should be able login successfully")
    public void i_should_be_able_login_successfully() {

        Assert.assertTrue(Elements.isDisplayed(driver, myAccountPage.myAccountBread));
    }

    @Then("I should see an error message that the credentials are invalid")
    public void i_should_see_an_error_message_that_the_credentials_are_invalid() {
        Assert.assertTrue(Elements.isDisplayed(driver, loginPage.mainWarning));

    }

    @When("I reset  the forgotten password for email {string}")
    public void iResetTheForgottenPasswordForEmail(String arg0) {
        Elements.click(driver, loginPage.forgottenLink);
        Elements.TypeText(driver, forgottenPasswordPage.email, arg0);
        Elements.click(driver, forgottenPasswordPage.continueButton);
    }

    @Then("I should see a message informing the User that information related to resting password have been sent to email address")
    public void i_should_see_a_message_informing_the_user_that_information_related_to_resting_password_have_been_sent_to_email_address() {

        Assert.assertTrue(Elements.VerifyTextEquals(loginPage.mainWarning, "An email with a confirmation link has been sent your email address."));

    }


}
