package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="username")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterUsernameAndPass(String Uname, String Password)
	{
		uname.sendKeys(Uname);	
		password.sendKeys(Password);
	}
	public void loginButton()
	{
		loginbutton.click();
	}

}
