package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
                "json:target/cucumber-report.json"
        },
        features = "src/test/resources/features" ,
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@test"
)

public class CukesRunner {


}
