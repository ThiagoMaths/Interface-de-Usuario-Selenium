package com.tutorialsninja.automation.base;


import org.openqa.selenium.WebDriver;
import com.tutorialsninja.automation.config.ConfigurationReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Base {

    public static Logger log = LoggerFactory.getLogger(Base.class);
    public static WebDriver driver;
    public static ConfigurationReader reader;

}


