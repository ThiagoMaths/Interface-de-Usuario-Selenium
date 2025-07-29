package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage {

    WebDriver driver;

    @FindBy(id = "content")
    public WebElement myAccountBread;

}
