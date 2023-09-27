package stepdefinition;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String title;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    
		title = loginPage.getLoginPageTitle();
		System.out.println("Login Page Title is :"+title);
		
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
	
		Assert.assertTrue(title.contentEquals(expectedTitleName));
		//Assert.assertEquals("Login", loginPage.getLoginPageTitle());
		
	}

	@Then("Register link should be displayed")
	public void register_link_should_be_displayed() {
	   
		Assert.assertTrue(loginPage.isRegisterLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String usernameValue) {
	   
		loginPage.enterUserName(usernameValue);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	   
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    
		loginPage.clickOnLogin();
	}



}
