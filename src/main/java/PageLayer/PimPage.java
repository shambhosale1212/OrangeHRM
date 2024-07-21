package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PimPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addbutton;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement fname1;
	
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lname;
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement savebutton;
	
	public PimPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String clockOnPimLink()
	{
		pim.click();
		return getDriver().getCurrentUrl();
	}
	public void clickOnAddEmployee()
	{
		addbutton.click();
		
	}
	public void addFirstnameLastname(String FirstName,  String LastName)
	{
		fname1.sendKeys(FirstName);
		lname.sendKeys(LastName);
	}
	public void clickOnSaveButton()
	{
		savebutton.click();
	}
}
