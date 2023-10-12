package stepdefinition;

import com.pages.QueuePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class QueuePageSteps {

	private QueuePage queuePage = new QueuePage(DriverFactory.getDriver());

	@When("The user clicks {string} link from main queue page")
	public void the_user_clicks_link_from_main_queue_page(String pageName) {
	    queuePage.navigatethru_QueuePage(pageName);
	}

}
