package StepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination 
{
	
	@Given("^User is on Netbanking landing page$")
	public void user_is_on_Netbanking_landing_page() throws Throwable 
	{
		
     System.out.println("User is on netbanking page");
	}

	@When("^User login into application with  Username and Password$")
	public void user_login_into_application_with_Username_and_Password() throws Throwable {
		System.out.println("User is logging in with Username and password");
	}

	@Then("^Homepage is populated$")
	public void homepage_is_populated() throws Throwable 
	{
		System.out.println("Home page is populated");
	}

	@Then("^Cards are Displayed$")
	public void cards_are_Displayed() throws Throwable
	{
		System.out.println("Cards are Displayed");
	}
	
	@When("^User login into application with  Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_login_into_application_with_Username_and_Password(String arg1, String arg2) throws Throwable
	{
	   System.out.println("Loging in with Username as" + arg1 +"Password"+arg2);
	}

	@Then("^Cards are Displayed \"([^\"]*)\"$")
	public void cards_are_Displayed(String arg1) throws Throwable 
	{
      System.out.println("Cards status"+ arg1);
	}
	
	
}