package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\001ZBY744\\eclipse-workspace\\project\\src\\test\\java\\features", glue = {
		"stepdefinitions" }, monochrome = true, tags = {
				"@tagregnew,@tagreg" }, plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml" },dryRun=false)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
