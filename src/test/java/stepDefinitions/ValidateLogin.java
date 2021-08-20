package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class ValidateLogin {

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("User is on landing page");
	}

    @When("^User logins into application with (.+) and (.+)$")
    public void user_logins_into_application_with_and(String user, String password) throws Throwable {
		System.out.println(user+"-"+password);
    }

    @Then("^User navigates to home page$")
	public void user_navigates_to_home_page() throws Throwable {
		System.out.println("User navigates to home page");
	}
    
    @And("^banking information displayed (.+)$")
    public void banking_information_displayed(String status) throws Throwable {
		System.out.println("banking information displayed "+status);
    }

}