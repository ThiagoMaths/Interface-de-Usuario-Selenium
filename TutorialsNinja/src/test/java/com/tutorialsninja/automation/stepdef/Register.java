package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Register {

    HeadersSection headersSection = new HeadersSection();
    RegisterPage registerPage = new RegisterPage();
    AccountSuccessPage accountSuccessPage = new AccountSuccessPage();

    @Given("^I launch the application$")
    public void i_launch_the_application() {

        Base.driver.get(Base.reader.getUrl());
    }

    @And("^I navigate to Account Registration page$")
    public void i_navigate_to_Account_Registration_page() {
        Elements.click(headersSection.myAccountLink);
        Elements.click(headersSection.register);
    }

    @When("^I provide all the below valid details$")
    public void i_provide_all_the_below_valid_details(DataTable dataTable) {

        registerPage.enterAllDetails(dataTable);

    }

    @And("^I select the Privacy Policy$")
    public void i_select_the_Privacy_Policy() {

        Elements.click(registerPage.privacyPolity);
    }

    @And("^I click on Continue Button$")
    public void i_click_on_Continue_Button() {

        Elements.click(registerPage.continueButton);
    }

    @Then("^I should see that the User account has successfully created$")
    public void i_should_see_that_the_User_account_has_created() {

        Assert.assertTrue(Elements.isDisplayed(accountSuccessPage.successBread));
    }

    @Then("I should see that the User account is not created")
    public void i_should_see_that_the_user_account_is_not_created() {

        Assert.assertTrue(Elements.isDisplayed(registerPage.registerBreadCrumb));
    }

    @And("I should see the error message informing the user to fill the mandatory fields")
    public void i_should_see_the_error_message_informing_the_user_to_fill_the_mandatory_fields() {

        Assert.assertTrue(Elements.isDisplayed(registerPage.firsNameWarning));
        Assert.assertTrue(Elements.isDisplayed(registerPage.lastNameWarning));
        Assert.assertTrue(Elements.isDisplayed(registerPage.emailWarning));
        Assert.assertTrue(Elements.isDisplayed(registerPage.telephoneWarning));
        Assert.assertTrue(Elements.isDisplayed(registerPage.passwordWarning));
        Assert.assertTrue(Elements.isDisplayed(registerPage.mainWarning));

    }

    @When("I subscribe to Newsletter")
    public void i_subscribe_to_newsletter() {
        Elements.selectRadioButton(registerPage.subscribeButton);
    }

    @Then("I should see that the User is restricted from creating duplicate account")
    public void i_should_see_that_the_user_is_restricted_from_creating_duplicate_account() {
        Assert.assertTrue(Elements.isDisplayed(registerPage.dangerWarning));
    }

}

