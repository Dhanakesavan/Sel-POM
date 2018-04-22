package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src/main/java/cucumberFeatures/DuplicateLead.feature", 
					glue= {"cucumberRunner","pages"}, 
//					tags= {"smoke"},
					monochrome = true)
public class RunTest {

}
