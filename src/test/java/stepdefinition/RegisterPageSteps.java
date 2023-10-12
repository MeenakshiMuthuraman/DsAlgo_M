package stepdefinition;

import java.util.List;

import org.openqa.selenium.Alert;

import com.pages.RegisterPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {
	
	private RegisterPage registerPage = new RegisterPage(DriverFactory.getDriver());

	@Given("User is on Registration Page")
	public void User_is_on_the_Registration_Page()
	{
		registerPage.getRegisterPage();
	}
	
	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	   List<String> registerdata = dataTable.transpose().asList(String.class);
	   for(String e: registerdata)
	   {
		   System.out.println("registerdata" + e);   
	   }
	}

	@When("User clicks on register button")
	public void user_clicks_on_register_button() {
	    registerPage.clickOnRegister();
	}

	@Then("User should get error message")
	public void user_should_get_error_message() {
	    
	}
}
