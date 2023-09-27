package stepdefinition;

import org.codehaus.plexus.util.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.DataStructurePage;
import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureSteps {

	private WebDriver driver = DriverFactory.getDriver();
	private DataStructurePage dsPage = new DataStructurePage(DriverFactory.getDriver());
	private HomePage hPage = new HomePage(DriverFactory.getDriver());
	
	@Given("User is logged into Ds-Algo website.")
	public void user_is_logged_into_ds_algo_website() {
	   driver.get(Constants.homeUrl);
	}

	@When("user clicks get started button below the Data Structure Introduction")
	public void user_clicks_get_started_button_below_the_data_structure_introduction() throws InterruptedException {
	  Thread.sleep(1000);
	  dsPage.getStartedDataStructurePage();
	}

	@Then("User should be navigated to {string} page.")
	public void user_should_be_navigated_to_page(String expectedTitle) {
	  String title = hPage.getPageTitle();
	  System.out.println("Actual Title ="+title);
	  System.out.println("Expected Title="+expectedTitle);
	  Assert.assertTrue(title.equalsIgnoreCase(expectedTitle));
	  }
	
	@Given("The user is in the Data structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
	   driver.get(Constants.dsUrl);
	   
	}

	@Given("The user clicks the Time Complexity page link")
	public void the_user_clicks_the_time_complexity_page_link(){
	   dsPage.clickTimeComplexityLink();
	}
	
	@When("The user clicks the Practise questions link")
	public void the_user_clicks_the_practise_questions_link() {
	   dsPage.clickPracticeQuestions();
	}
	
	@When("The user clicks Try Here button on Data Structure")
	public void the_user_clicks_Try_Here_button_on_data_structure() {
		hPage.clickOnTryHere();
	}
	
	@Then("User should be navigated to {string} page of Data Structures")
	public void user_should_be_navigated_to_page_of_data_structures(String expectedpage) {
		System.out.println("Expected Page="+expectedpage);
		String actual = hPage.getPageTitle();
		System.out.println("ACtual URL="+actual);
		Assert.assertTrue(actual.equalsIgnoreCase(expectedpage));
	}
	
	@Given("user is on the Time Complexity page of Data Structure")
	public void user_is_on_the_time_complexity_page_of_data_structure() {
	    dsPage.clickTimeComplexityLink();
	}

}
