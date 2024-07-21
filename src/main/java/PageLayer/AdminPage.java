package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class AdminPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin; 
	
	@FindBy(xpath=" //button[text()=' Add '] ")
	private WebElement add1; 
	
	@FindBy(xpath="//label[text()='User Role']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")
	private WebElement userrole; 
	
	@FindBy(xpath="//label[text()='User Role']/parent::div/following-sibling::div/descendant::span[text()='Admin']")
	private WebElement userroledropdown;
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")
	private WebElement status;
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div/descendant::span[text()='Enabled']")
	private WebElement statusdropdown;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement employeename;
	
	@FindBy(xpath="//label[text()='Username']/parent::div/following-sibling::div/child::input")
	private WebElement username2;
	
	@FindBy(xpath="//label[text()='Password']/parent::div/following-sibling::div/child::input")
	private WebElement password2;
	
	@FindBy(xpath="//label[text()='Confirm Password']/parent::div/following-sibling::div/child::input")
	private WebElement confirmpassword1;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement savebutton;
	
	public AdminPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	public String clickOnAdmin()
	{
		admin.click();
		return getDriver().getCurrentUrl();
	}
	
	public void clickOnAddButton()
	{
		add1.click();
	}
	
	public void userRoleEmployeeNameUserStatus(String Employeename)
	{
		userrole.click();
		userroledropdown.click();
		employeename.sendKeys(Employeename);
		status.click();
		statusdropdown.click();
	}
	
	public void userNamePasswordConfirmPassword(String Uname1, String Pass, String ConfPass)
	{
		
		username2.sendKeys(Uname1);
		password2.sendKeys(Pass);
		confirmpassword1.sendKeys(ConfPass);
	}
	
	public void clickOnSaveButton()
	{
		savebutton.click();
	}
	
	
	
	
	

}
