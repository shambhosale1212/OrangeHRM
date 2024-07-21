package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStepTest extends BaseClass{
	
	private HomePage homepage;
	
	@When("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
		
	homepage= new HomePage();
	Assert.assertEquals(homepage.getTitle(), "OrangeHRM");
	  
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		
		Assert.assertEquals(homepage.getCurrentUrl().contains("orange"), true);

	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo() {
		Assert.assertEquals(homepage.checkLogoDisplayedStatus(), true);

	}

}
