package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.framework.Elements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.tutorialsninja.automation.base.Base.driver;


public class MyAccountPage {

   private WebDriver driver;

   public MyAccountPage(WebDriver driver) {
       PageFactory.initElements(driver, this);
   }

    @FindBy(id = "content")
    public WebElement myAccountBread;

   public void SuccessfullyLogin() {
       Assert.assertTrue(Elements.isDisplayed(driver, myAccountBread));
    }

}
