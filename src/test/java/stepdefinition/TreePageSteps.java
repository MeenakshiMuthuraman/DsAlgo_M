package stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.pages.TreePage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePageSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	private TreePage treePage = new TreePage(DriverFactory.getDriver());

	
	@Given("The user is in the Tree page after logged in")
	public void the_user_is_in_the_tree_page_after_logged_in() {
		treePage.navigateToTreePage();
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	    treePage.overviewTreeLink();
	}

	@When("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String expectedTitle) throws InterruptedException {
		String actualTitle = treePage.getTitleTreePage();
		System.out.println("The title of the Page is " +actualTitle+ "\nThe expected title is " +expectedTitle);
		Assert.assertTrue(actualTitle.contentEquals(expectedTitle));
		}
	

	@Given("The user is in the Overview of Trees page after logged in")
	public void the_user_is_in_the_overview_of_trees_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
