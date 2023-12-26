package com.sample.sample.cucmberIntegration;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/",
        glue = {"com/sample/sample/stepDefs"},
        plugin = {"pretty","summary", "html:target/Test-Reports/cucumber-html-report.html",
                "json:target/Test-Reports/cucumber-report.json", "json:target/Test-Reports/cucumber.json",
                "pretty:target/Test-Reports/cucumber-pretty.txt", "usage:target/Test-Reports/cucumber-usage.json",
                "junit:target/Test-Reports/cucumber-results.xml", "testng:target/Test-Reports/testng-output.xml"},
         monochrome = true


)
public class CucumberIntegrationTest extends AbstractTestNGCucumberTests {





}
