package na.rerunCucumber.stepDef;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^Stepdefinitions are implemented properly$")
	public void stepdefinitions_are_implemented_properly()  {
	    System.out.println("Given");
	    
	}

	@When("^I run this scenario$")
	public void i_run_this_scenario()  {
	   System.out.println("When");
	    
	}

	@Then("^This scenario should \"([^\"]*)\"$")
	public void this_scenario_should(String testStatus)  {
	    System.out.println("Then");
		Assert.assertTrue(testStatus.equalsIgnoreCase("Pass")? true:false);
	    
	}

}
