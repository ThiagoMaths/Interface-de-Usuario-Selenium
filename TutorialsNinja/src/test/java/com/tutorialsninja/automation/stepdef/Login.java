package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.DriverManager;
import com.tutorialsninja.automation.pages.ForgottenPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    HeadersSection headersSection = new HeadersSection(DriverManager.getDriver());
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());
    MyAccountPage myAccountPage = new MyAccountPage(DriverManager.getDriver());
    ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage(DriverManager.getDriver());

    @Given("I navigate to Account Login page")
    public void i_navigate_to_account_login_page() {
        headersSection.MyAccountToLogin();
    }

    @When("I enter email and Password")
    public void i_enter_email_and_password() {
        loginPage.detailEmail();
    }

    @When("I click on Login button")
    public void i_click_on_login_button() {
        loginPage.loginButton();
    }

    @Then("I should be able login successfully")
    public void i_should_be_able_login_successfully() {
        myAccountPage.isMyAccountBreadDisplayed();
    }

    @When("I enter Email and Password invalid")
    public void iEnterEmailAndPasswordInvalid() {
        loginPage.detailEmailInvalid();
    }

    @When("I enter Username empty and Password empty")
    public void iEnterUsernameEmptyAndPasswordEmpty() {
        loginPage.emailAndPasswordEmpty();
    }

    @Then("I should see an error message that the credentials are invalid")
    public void i_should_see_an_error_message_that_the_credentials_are_invalid() {
        loginPage.mainWarning();
    }

    @When("I reset  the forgotten password for email")
    public void iResetTheForgottenPasswordForEmail() {
        loginPage.forgottenLink();
        forgottenPasswordPage.sendEmail();
    }

    @Then("I should see a message informing the User that information related to resting password have been sent to email address")
    public void i_should_see_a_message_informing_the_user_that_information_related_to_resting_password_have_been_sent_to_email_address() {
        loginPage.mainWarning();
    }

    @When("I reset the forgotten password for email with an invalid email")
    public void i_reset_the_forgotten_password_for_email_with_an_invalid_email() {
        loginPage.forgottenLink();
        forgottenPasswordPage.sendEmailInvalid();
    }

    @Then("I should see an error message indicating the email is invalid")
    public void i_should_see_an_error_message_indicating_the_email_is_invalid() {
        forgottenPasswordPage.forgottenAlert();
    }


}
