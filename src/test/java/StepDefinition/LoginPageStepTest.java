package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepTest extends BaseClass {
	private static LoginPage loginpage;
	@Given("user open a login page url in {string} browser")
	public void user_open_a_login_page_url_in_browser(String browsername) {
		
		BaseClass.initialazation(browsername);

	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {

	loginpage= new LoginPage();
	loginpage.enterUsernameAndPass("Admin", "admin123");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		loginpage.loginButton();
	}


}
