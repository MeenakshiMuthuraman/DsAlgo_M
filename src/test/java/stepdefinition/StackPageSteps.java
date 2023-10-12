package stepdefinition;


import java.io.IOException;
import java.util.List;
import java.util.Map;


import com.pages.ExcelReader;


import com.pages.StackPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackPageSteps {

	private StackPage stackPage = new StackPage(DriverFactory.getDriver());

		
	@When("The user clicks {string} link from main stack page")
	public void the_user_clicks_link_from_main_stack_page(String stack) {
		
	    stackPage.navigatethru_mainPage(stack);
	}

	@When("The user enter valid python code in tryEditor from sheetname {string} and rownumber {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheetname_and_rownumber(String sheetName, Integer rownumber)throws IOException, InterruptedException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/resources/TestData/AutomationTestData.xlsx";
		System.out.println(filePath);
		ExcelReader sheetreader = new ExcelReader();

			List<Map<String, String>> code = sheetreader.getData(filePath, sheetName);
			String typeCode = code.get(rownumber).get("pythonCode_valid");
			stackPage.fillCodeEditor(typeCode);
		}

	@When("The user enter invalid python code in tryEditor from sheetname {string} and rownumber {int}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheetname_and_rownumber(String sheetName, Integer rownumber)throws IOException, InterruptedException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/resources/TestData/AutomationTestData.xlsx";
		System.out.println(filePath);
		ExcelReader sheetreader = new ExcelReader();

			List<Map<String, String>> code = sheetreader.getData(filePath, sheetName);
			String typeCode = code.get(rownumber).get("Column2");
			stackPage.fillCodeEditor(typeCode);
		}

	@Then("The user should get error message for invalid code")
	public void The_user_should_get_error_message_for_invalid_code()
	{
		String invalidcodeError = stackPage.getInvalidCodeError();
		System.out.println(invalidcodeError);
	}
	

}
