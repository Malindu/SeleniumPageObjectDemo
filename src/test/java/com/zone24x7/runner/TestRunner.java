package com.zone24x7.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import com.zone24x7.utils.DriverFactory;

@CucumberOptions(
        features = "src/test/java/com/zone24x7/features",
        glue = {"com.zone24x7.steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        tags = "@Regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void tearDown(){
        DriverFactory.quitDriver();
    }


}
