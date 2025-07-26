package com.tutorialsninja.automation.framework;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.tutorialsninja.automation.base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Browser {


    public static Logger log = LoggerFactory.getLogger(Browser.class);

    public static WebDriver startBrowser() {
        String browser = Base.reader.getBrowser().toLowerCase();
        log.info("Selected Browser is: {}", browser);

        switch (browser) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                Base.driver = new ChromeDriver();
                log.info("Chrome Browser is Started{}", Base.driver.hashCode());
                return Base.driver;

            case "ie":
                WebDriverManager.iedriver().setup();
                Base.driver = new InternetExplorerDriver();
                log.info("Internet Explorer Browser is Started{}", Base.driver.hashCode());
                return Base.driver;

            default:
                WebDriverManager.firefoxdriver().setup();
                Base.driver = new FirefoxDriver();
                log.info("Firefox Browser is Started{}", Base.driver.hashCode());
                return Base.driver;
        }

    }


}
