package stepdefinition;

import com.pages.HomePage;
import com.pages.QueuePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class QueuePageSteps {

	private QueuePage queuePage = new QueuePage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@When("The user clicks {string} link from main queue page")
	public void the_user_clicks_link_from_main_queue_page(String pageName) {
	    queuePage.navigatethru_QueuePage(pageName);
	}
	@Given("The user is in {string} queue page having tryEditor with Run button")
	public void The_user_is_in_implementation_page_having_tryEditor_with_run_button(String pageName)
	{
		queuePage.Page_tryEditor(pageName);
	}

}
