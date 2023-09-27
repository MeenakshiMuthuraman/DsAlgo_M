package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
//import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	private WebDriver driver = DriverFactory.getDriver();
	private HomePage home = new HomePage(DriverFactory.getDriver());
	
	
	@Given("user is logged in to DS Algo portal")
	public void user_is_logged_in_to_ds_algo_portal() {
		
		driver.get(Constants.homeUrl);
		
	}
	
	@When ("user is on the {string} after logged in")
	public void user_clicks_page_Name(String page_name) {
		
		home.getHomePage(page_name);
	}
	@When ("user clicks {string} page")
	public void user_clicks_page_Name_Home(String page_name) {
		
		home.startHomePage(page_name);
		System.out.println("Page Name is:"+page_name);
	}
	@Then ("check the title of the page {string}")
	public void check_the_title_of_the_page(String expectedTitleName) {
		
		String title = home.getPageTitle();
		System.out.println("The title of the Page is "+title+"\nThe expected title is "+expectedTitleName);
		Assert.assertTrue(title.contentEquals(expectedTitleName));
	}
	@When("user clicks try here button")
	public void user_clicks_link() {
		
		home.clickOnTryHere();
	}
	@When("The user clicks on run button")
	public void user_clicks_on_run_button()
	{
		home.clickOnRunButton();
	}
	@Then("user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		

		Assert.assertTrue(home.istryEditorExists());
		Assert.assertTrue(home.isRunButtonExists());
	}

	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
    
		home.getTryEditor();
	
	}
	@Given("user is on Ds Algo Portal page with signIn link")
	public void user_is_on_ds_algo_portal_page_with_sign_in_link() {
		
	    home.getDsAlgoPortalUrl();
	}
	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() throws InterruptedException {
		
		Assert.assertTrue(home.isAnswerDisplayed());
	}

}
