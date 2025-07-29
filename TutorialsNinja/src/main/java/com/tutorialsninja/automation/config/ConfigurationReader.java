package com.tutorialsninja.automation.config;

public interface ConfigurationReader {

    String getUrl();

    String getBrowser();

    int getPageLoadTimeOut();

    String getUserName();

    String getPassword();

    String getProduct();

}
