package stepdefinition;


import java.io.IOException;
import java.util.*;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.ArrayPage;
import com.pages.ExcelReader;
import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import com.qa.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPageSteps {
	
//	private WebDriver driver = DriverFactory.getDriver();
	private ArrayPage arrayPage = new ArrayPage(DriverFactory.getDriver());
//	private HomePage homePage = new HomePage(DriverFactory.getDriver());



//	@When("user is on the {string} after logged in")
//	public void user_is_on_the_after_logged_in(String arrayTitle) {
//		
//		arrayPage.ArrayHome();
//
//	}

	@When("user is on the Applications of Array after array page")
	public void user_is_in_the_after_array_page() throws InterruptedException {
		
		arrayPage.startApplicationofArrayPage();

	}
	
	
	

//		@When("The user enter valid python code in tryEditor from sheetname {string} and rownumber {int}")
//	public void the_user_enter_valid_python_code_in_try_editor_from_sheetname_and_rownumber(String sheetName, Integer rownumber)throws IOException, InterruptedException {
//		
//		String filePath = System.getProperty("user.dir")+"/src/test/resources/TestData/AutomationTestData.xlsx";
//		System.out.println(filePath);
//		ExcelReader sheetreader = new ExcelReader();
//
//			List<Map<String, String>> code = sheetreader.getData(filePath, sheetName);
//			String typeCode = code.get(rownumber).get("pythonCode_valid");
//			String typeCode2 = code.get(rownumber).get("Column2");
//			System.out.println("PythonExample code:"+typeCode2);
//			arrayPage.fillCodeEditor(typeCode);
//		}
//
//	@When("The user clicks on run button")
//	public void the_user_clicks_on_run_button() {
//		
//		homePage.clickOnRunButton();
//		
//	}
//
//	@Then("The user should be presented with Run result")
//	public void the_user_should_be_presented_with_run_result() throws InterruptedException {
//		
//		Assert.assertTrue(arrayPage.isAnswerDisplayed());
//	}

	
}
