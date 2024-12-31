package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/sravankumartalishetti/git/Automation/LoginTest/src/test/resources/Features/GoogleSearch.feature",
glue= {"StepDefinitions"},
monochrome= true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json"
		}
		)
public class TestRunner {

}

