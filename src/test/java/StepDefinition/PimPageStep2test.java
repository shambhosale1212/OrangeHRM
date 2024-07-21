package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PimPage;
import io.cucumber.java.en.When;

public class PimPageStep2test extends BaseClass{
	private PimPage pimpage;
	@When("user is on pim page and validate url")
	public void user_is_on_pim_page_and_validate_url() {
		 pimpage= new PimPage();
		 String actualUrl=pimpage.clockOnPimLink();
		 Assert.assertEquals(actualUrl.contains("pim"), true);
	    
	}

	@When("user click on add employee")
	public void user_click_on_add_employee() {
		pimpage.clickOnAddEmployee();

	}

	@When("user enter firstname and last name")
	public void user_enter_firstname_and_last_name() {
		
		pimpage.addFirstnameLastname("sham", "bhosale");


	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		
		pimpage.clickOnSaveButton();
		
		getDriver().close();

	}

}
