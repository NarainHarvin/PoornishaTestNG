package runPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeaturesFiles",
		glue={"stPackage"},
		dryRun=false,
		monochrome=true,
		tags="@hooks"
		)

public class RunnerClass {

}