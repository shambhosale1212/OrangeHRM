package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ClaimPage extends BaseClass {
	 @FindBy(xpath="//span[text()='Claim']")
	 private WebElement CL;
	 
	 
	 public ClaimPage()
	 {
		 PageFactory.initElements(getDriver(), this);
	 }
	 
	 public void clickOnClaim()
	 {
		 CL.click();
		 
	 }

}
