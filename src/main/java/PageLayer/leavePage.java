package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class leavePage extends BaseClass {
	
	@FindBy(xpath ="//span[text()='Leave']")
	private WebElement leave;
	
	public leavePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickonleave()
	{
		leave.click();
	}

}
