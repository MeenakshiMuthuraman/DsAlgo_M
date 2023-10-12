package stepdefinition;


import com.pages.GraphPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;

public class GraphPageSteps {
	
	private GraphPage graphPage = new GraphPage(DriverFactory.getDriver());
	
	@Given("The user clicks {string} link from main graph page")
	public void the_user_clicks_link_from_main_graph_page(String graph) {
		graphPage.navigatethru_graphPage(graph);
	}
	}
