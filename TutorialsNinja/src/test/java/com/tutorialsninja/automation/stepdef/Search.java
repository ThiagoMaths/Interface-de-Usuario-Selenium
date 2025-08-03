package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

import static com.tutorialsninja.automation.base.Base.driver;

public class Search {

    HeadersSection headersSection = new HeadersSection(driver);
    SearchResultPage searchResultPage = new SearchResultPage(driver);

    @When("I search for a product")
    public void i_search_for_a_product() throws IOException {
        headersSection.searchProducts();
    }

    @Then("I should see the product in the search results")
    public void i_should_see_the_product_in_the_search_results() {
        searchResultPage.isSearchResult();
    }

    @When("I search for a product missing")
    public void iSearchForAProductMissing() throws IOException {
        headersSection.searchProductsInvalid();
    }

    @Then("I should see the page displaying the message")
    public void i_should_see_the_page_displaying_the_message() {
        searchResultPage.isSearchEmpty();
    }


}
