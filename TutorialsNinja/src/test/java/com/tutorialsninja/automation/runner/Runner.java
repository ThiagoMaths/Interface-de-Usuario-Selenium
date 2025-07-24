package com.tutorialsninja.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:FeatureFiles/Login.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin = "html:target/cucumber-reports/cucumber.html",
tags = "@Register or @Login")

public class Runner {

}
