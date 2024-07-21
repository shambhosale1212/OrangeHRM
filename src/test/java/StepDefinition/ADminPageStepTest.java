package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.AdminPage;
import io.cucumber.java.en.When;

public class ADminPageStepTest extends BaseClass{
	
	public  static AdminPage adminpage;
	
	@When("user is on admin page validate url")
	public void user_is_on_admin_page_validate_url() {
		
		adminpage= new AdminPage();
		String actualurl=adminpage.clickOnAdmin();
		Assert.assertEquals(actualurl.contains("admin"), true);
		
	

	}

	@When("user click on add button in admin page")
	public void user_click_on_add_button_in_admin_page() {
		
		adminpage.clickOnAddButton();
		


	}

	@When("user select user role and enter employee name and user select the status")
	public void user_select_user_role_and_enter_employee_name_and_user_select_the_status() {
		
		adminpage.userRoleEmployeeNameUserStatus("Rohit shinde");

	}

	@When("user enter username and password and confirm password")
	public void user_enter_username_and_password_and_confirm_password() {
		adminpage.userNamePasswordConfirmPassword("sham1212@gmail.com", "sham@123", "sham@123");

	}

	@When("user click on save button admin page")
	public void user_click_on_save_button_admin_page() {
		

		adminpage.clickOnSaveButton();
	}


}
