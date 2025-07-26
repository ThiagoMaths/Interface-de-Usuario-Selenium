package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import io.cucumber.java.en.*;

public class Orders {

    Base base = new Base();
    HeadersSection headersSection = new HeadersSection();
    LoginPage loginPage = new LoginPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @Given("I login to the application")
    public void i_login_to_the_application() {

        base.driver.get(Base.reader.getUrl());
        Elements.click(headersSection.myAccountLink);
        Elements.click(headersSection.login);
        Elements.TypeText(loginPage.emailField, base.reader.getUserName());
        Elements.TypeText(loginPage.passwordField, base.reader.getPassword());
        Elements.click(loginPage.loginButton);
    }
    @When("I add any product to Bag and checkout")
    public void i_add_any_product_to_bag_and_checkout() {
        Elements.TypeText(headersSection.searchField, base.reader.getProduct());
        Elements.click(headersSection.buttonSearch);
        Elements.click(searchResultPage.firstAddToCartOption);
    }
    @When("I place an order")
    public void i_place_an_order() {

    }
    @Then("I should see that the order is placed successfully")
    public void i_should_see_that_the_order_is_placed_successfully() {

    }


}
