package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

    public SearchResultPage() {

        PageFactory.initElements(Base.driver, this);

    }

    @FindBy(linkText = "Search")
    public WebElement searchResults;

}
