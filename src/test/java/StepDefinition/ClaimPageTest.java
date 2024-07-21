package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.ClaimPage;
import io.cucumber.java.en.When;

public class ClaimPageTest extends BaseClass {
	
	@When("user Click on page")
	public void user_click_on_page() {
		ClaimPage claimPage =new ClaimPage();
		claimPage.clickOnClaim();

	}

}
