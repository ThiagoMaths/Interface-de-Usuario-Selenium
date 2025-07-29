package com.tutorialsninja.automation.framework;

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

    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static final String IE = "ie";

    public static WebDriver startBrowser(String browser) {

        browser = Base.reader.getBrowser().toLowerCase();
        log.info("Selected Browser is: {}", browser);

        WebDriver driver;
        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                log.info("Chrome Browser is Started");
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                log.info("Internet Explorer Browser is Started{}");
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                log.info("Firefox Browser is Started{}");
                break;

            default:
                log.error("Invalid browser specified: {}", browser);
                throw new IllegalArgumentException("Invalid browser specified: " + browser);

        }
        return driver;
    }


}
