package com.tutorialsninja.automation.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.tutorialsninja.automation.config.ConfigurationReader;
import com.tutorialsninja.automation.config.PropertyFileReader;
import com.tutorialsninja.automation.framework.Browser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Base {

    public static Logger log = LoggerFactory.getLogger(Base.class);

    public static WebDriver driver;
    public static ConfigurationReader reader;


    @Before
    public void setUp(Scenario scenario) {

        log.info("Scenario Started: {}", scenario.getName());
        reader = new PropertyFileReader();
        Browser.startBrowser();
        Browser.maximize();

    }

    @After
    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            try {

                final byte[] screenshot = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());

            } catch (final Exception e) {
                log.error("Error while screenshot: {}", e.getMessage(), e);
            }
        }

        log.info("Scenario Completed: {}", scenario.getName());
        log.info("Scenario Status is: {}", scenario.getName());

        try {

            if (driver != null) {
                driver.quit();
            }

        } catch (final Exception e) {
            log.error("Error while quit: {}", e.getMessage(), e);
        }

    }
}


