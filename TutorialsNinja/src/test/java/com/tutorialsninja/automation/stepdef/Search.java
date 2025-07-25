package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {

    HeadersSection headersSection = new HeadersSection();
    SearchResultPage searchResultPage = new SearchResultPage();

    @When("I search for a product {string}")
    public void i_search_for_a_product(String product) {

        Elements.TypeText(headersSection.searchField, product);
        Elements.click(headersSection.buttonSearch);

    }
    @Then("I should see the product in the search results")
    public void i_should_see_the_product_in_the_search_results() {

        Assert.assertTrue(Elements.isDisplayed(searchResultPage.searchResults));

    }

    @Then("I should see the page displaying the message {string}")
    public void i_should_see_the_page_displaying_the_message(String product) {

        Assert.assertTrue(Elements.VerifyTextEquals(searchResultPage.searchEmpty, product));


    }
}
