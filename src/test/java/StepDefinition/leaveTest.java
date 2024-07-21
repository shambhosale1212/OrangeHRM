package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.leavePage;
import io.cucumber.java.en.When;

public class leaveTest extends BaseClass{
	
	@When("user click on leave page")
	public void user_click_on_leave_page() {
		leavePage LeavePage = new leavePage();
		LeavePage.clickonleave();
	}


}
