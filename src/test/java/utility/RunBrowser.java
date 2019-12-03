package utility;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features" },
				 glue = { "steps" }, monochrome = true, strict = true, plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class RunBrowser 
{}
