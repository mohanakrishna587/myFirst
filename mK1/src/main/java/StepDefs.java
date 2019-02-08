

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	@Given("^I am a hero$")
	public void i_am_a_hero() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("1");   
	}

	@Then("^You are a heroin$")
	public void you_are_a_heroin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("2");
	}

	@Given("^I start the movie$")
	public void i_start_the_movie() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("3"); 
	}

	@When("^the interval bell rings$")
	public void the_interval_bell_rings() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("4");
	}

	@Then("^I getup and go$")
	public void i_getup_and_go() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("5");
	}
}
