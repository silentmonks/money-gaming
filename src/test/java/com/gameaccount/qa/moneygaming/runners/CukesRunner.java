package com.gameaccount.qa.moneygaming.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", "html:target/cucumber-reports"
        },

        features = "src/test/resources/features",
        glue = "com.gameaccount.qa.moneygaming.step_definitions",
        dryRun = false,
        monochrome = true
        //tags = "@test"
)


public class CukesRunner {}
