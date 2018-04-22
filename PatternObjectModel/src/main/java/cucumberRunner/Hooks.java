package cucumberRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods{
	@Before
	public void before(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase("leaftaps");
		test.assignCategory("smoke");
		test.assignAuthor("Kesavan");
		startApp("chrome");		
	}
	
	@After
	public void after() {
		endResult();
		closeAllBrowsers();
	}


}

