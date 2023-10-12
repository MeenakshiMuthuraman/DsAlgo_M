package stepdefinition;


import org.junit.Assert;
import com.pages.TreePage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePageSteps {
	
	private TreePage treePage = new TreePage(DriverFactory.getDriver());

	
	@Given("The user is in the Tree page after logged in")
	public void the_user_is_in_the_tree_page_after_logged_in() {
		treePage.navigateToTreePage();
	}
	
	@When("The user clicks {string} link from main tree page")
	public void the_user_clicks_link_from_main_tree_page(String pageName) throws InterruptedException {
		treePage.navigateFromTreePage(pageName);
	}
	
	@Given("The user is in {string} page having tryEditor with Run button")
	public void The_user_is_in_implementation_page_having_tryEditor_with_run_button(String pageName)
	{
		treePage.opentryEditor(pageName);
	}
	
	@Given("The user is in the Implementation Of BST page after logged in") //
	 public void the_user_is_in_the_implementation_of_bst_page_after_logged_in() {
		treePage.navigateToBstPage();
		String url = treePage.getCurrentPageUrl(); //
		System.out.println("The url of the page is " +url); //
		Assert.assertTrue(url.contains("implementation-of-bst"));
	}
	
	@When("The user clicks {string} link")
	public void the_user_should_be_directed_to_link(String link){
		treePage.clickPracticeQuestions();
		}
	
	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String expectedUrl) throws InterruptedException{
		String url = treePage.getCurrentPageUrl();
		System.out.println("current url is " +url);
		System.out.println("The url of the page is " +url+ "\nThe expected title is " +expectedUrl);
		Assert.assertTrue(url.contains(expectedUrl));
		}
	
}
	

