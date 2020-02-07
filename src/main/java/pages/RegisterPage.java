package pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import times.TestUtils;
public class RegisterPage extends TestBase
{
	public RegisterPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement Registerbtn;
	
	@FindBy(xpath="/Themes/Test/img/cicero-logo-white.png")
	WebElement logo;
	
	@FindBy(xpath="//h3[contains(text(),'Create New Account')]")
	WebElement Content1;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement conPassword;
	
	@FindBy(xpath="//button[contains(text(),'Sign up')]")
	WebElement Signup;
	
	@FindBy(xpath="//a[contains(text(),'Login here')]")
	WebElement Loginherebtn;
	
	@FindBy(xpath="//span[@id='FirstName-error']")
	WebElement ErrorFName;;
	
	@FindBy(xpath="//span[@id='LastName-error']")
	WebElement ErrorLName;
	
	@FindBy(xpath="//span[@id='Email-error']")
	WebElement ErrorEmail;
	
	@FindBy(xpath="//span[@id='Password-error']")
	WebElement ErrorPassword;
	
	
	@FindBy(xpath="//span[@id='ConfirmPassword-error']")
	WebElement ErrorCPassword;
	
	
	public void clickRegister()
	{
		Registerbtn.click();
	}
	
	public boolean Logo()
	{
		return logo.isDisplayed();
	}
	public String Content()
	{
		return Content1.getText();	
	}
	
	public void clickSignUp()
	{
		Signup.click();
	}
	
	public String FirstNameError()
	{
		return ErrorFName.getText();	
	}
	
	public String LastNameError()
	{
		return ErrorLName.getText();	
	}
	
	public String EmailError()
	{
		return ErrorEmail.getText();	
	}
	
	public String PasswordError()
	{
		return ErrorPassword.getText();	
	}
	
	public void getName(String FirstName, String LastName)
	{
		firstName.clear();
		firstName.sendKeys(FirstName);
		lastName.clear();
		lastName.sendKeys(LastName);	
	}
	
	public void getEmail(String emailId)
	{
		Email.clear();
		Email.sendKeys(emailId);
	}
	
	public void getPassword(String Password, String ConPassword)
	{
		password.clear();
		password.sendKeys(Password);
		conPassword.clear();
		conPassword.sendKeys(ConPassword);	
	}
	
	public String ConfirmPasswordError()
	{
		return ErrorCPassword.getText();	
	}
	
	public void LoginHereButton()
	{
		Loginherebtn.click();
	}
}
