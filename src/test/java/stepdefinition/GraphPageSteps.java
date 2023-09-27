package stepdefinition;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.pages.ExcelReader;
import com.pages.GraphPage;
import com.pages.StackPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPageSteps {
	
	private GraphPage graphPage = new GraphPage(DriverFactory.getDriver());
	private StackPage stackPage = new StackPage(DriverFactory.getDriver());
	
	@Given("The user clicks {string} link from main graph page")
	public void the_user_clicks_link_from_main_graph_page(String graph) {
		graphPage.navigatethru_graphPage(graph);
	}
	@Given("The user is in {string} graph page having tryEditor with Run button")
	public void The_user_is_in_implementation_page_having_tryEditor_with_run_button(String pageName)
	{
		graphPage.Page_tryEditor(pageName);
	}
	@When("The user enter invalid python code in tryEditor from sheetname {string} and rownumber {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheetname_and_rownumber(String sheetName, Integer rownumber)throws IOException, InterruptedException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/resources/TestData/AutomationTestData.xlsx";
		System.out.println(filePath);
		ExcelReader sheetreader = new ExcelReader();

			List<Map<String, String>> code = sheetreader.getData(filePath, sheetName);
			String typeCode = code.get(rownumber).get("pythonCode_valid");
			String typeCode2 = code.get(rownumber).get("Column2");
			System.out.println("PythonExample code:"+typeCode2);
			stackPage.fillCodeEditor(typeCode2);
		}
	@Then("The user should error message for invalid code")
	public void The_user_should_get_error_message_for_invalid_code()
	{
		String invalidcodeError = graphPage.getInvalidCodeError();
		System.out.println(invalidcodeError);
	}
}
