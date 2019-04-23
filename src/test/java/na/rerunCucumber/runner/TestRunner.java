package na.rerunCucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resources/featureFiles",
			glue = {"na.rerunCucumber.stepDef"},
			plugin = "rerun: target/rerun.txt",
			dryRun = false		
		)
public class TestRunner {

}
