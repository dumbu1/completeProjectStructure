package runs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = {"hooks","stepDefinations"},
		monochrome = true,
		dryRun = false
		
		)

public class RunAll {

}
