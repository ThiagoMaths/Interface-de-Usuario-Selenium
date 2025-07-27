package com.tutorialsninja.automation.pages;

import org.junit.Assert;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.tutorialsninja.automation.base.Base.driver;

public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(Base.driver, this);

    }

    @FindBy(id = "content")
    public WebElement myAccountBread;

    public void isUserLoggedIn() {
        Assert.assertTrue(Elements.isDisplayed(driver, myAccountBread));

    }
}
