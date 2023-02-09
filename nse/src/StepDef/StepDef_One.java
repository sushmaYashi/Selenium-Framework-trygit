package StepDef;


import com.aventstack.extentreports.Status;
import com.guru.Util.Config;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_One {
	
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		 Utilityfolder.Config.createTest("BrowseLaunch", "Validating Browser and URL launch");
		  Utilityfolder.Config.getBrowser("chrome");
		  Utilityfolder.Config.test.log(Status.PASS, "User is able to launch browser and url successfully");
	}

	@When("^click on any of the item to open$")
	public void click_on_any_of_the_item_to_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^it should open the item$")
	public void it_should_open_the_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
