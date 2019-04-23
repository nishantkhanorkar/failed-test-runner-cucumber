package na.rerunCucumber.stepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void doThisBeforeEveryTest() {
		System.out.println(" =================== Start of Scenario ==================");
	}
	
	@After
	public void doThisAfterEveryScenario() {
		
		System.out.println(" =================== End of Scenario   ==================");
		System.out.println();
	}
	
	
}
