package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.config.PropertyFileReader;
import com.tutorialsninja.automation.framework.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {
    private static Logger log = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void setUp(Scenario scenario) {

        log.info("Scenario Started: " + scenario.getName());
        Base.reader = new PropertyFileReader();
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
                log.error("Error while screenshot: " + e.getMessage(), e);
            }
        }

        log.info("Scenario Completed: " + scenario.getName());
        log.info("Scenario Status is: " + scenario.getName());

        try{

            if (Base.driver != null) {
                Base.driver.quit();
            }

        } catch (final Exception e) {
            log.error("Error while quit: " + e.getMessage(), e);
        }

    }

}
