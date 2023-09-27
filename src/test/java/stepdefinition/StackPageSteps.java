package stepdefinition;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.ExcelReader;
import com.pages.HomePage;

//import org.junit.Assert;

import com.pages.StackPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackPageSteps {

	private StackPage stackPage = new StackPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

		
	@When("The user clicks {string} link from main stack page")
	public void the_user_clicks_link_from_main_stack_page(String stack) throws InterruptedException {
		
	    stackPage.navigatethru_mainPage(stack);
	}

	@When("The user enter valid python code in tryEditor from sheetname {string} and rownumber {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheetname_and_rownumber(String sheetName, Integer rownumber)throws IOException, InterruptedException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/resources/TestData/AutomationTestData.xlsx";
		System.out.println(filePath);
		ExcelReader sheetreader = new ExcelReader();

			List<Map<String, String>> code = sheetreader.getData(filePath, sheetName);
			String typeCode = code.get(rownumber).get("pythonCode_valid");
			String typeCode2 = code.get(rownumber).get("Column2");
			System.out.println("PythonExample code:"+typeCode2);
			stackPage.fillCodeEditor(typeCode);
		}

	
	
	@Given("The user is in {string} stack page having tryEditor with Run button")
	public void The_user_is_in_implementation_page_having_tryEditor_with_run_button(String pageName)
	{
		stackPage.Page_tryEditor(pageName);
	}
	
//	@Then("The user should be presented with Run result")
//	public void the_user_should_be_presented_with_run_result() throws InterruptedException {
//		
//		Assert.assertTrue(homePage.isAnswerDisplayed());
//	}
}
