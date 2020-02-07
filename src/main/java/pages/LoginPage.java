package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
//import times.TestUtils;
//import xpaths.Xpath;

public class LoginPage extends TestBase
{
	public LoginPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//label[contains(text(),'Email address')]")
	WebElement usrenametab;
	
	@FindBy(xpath="//label[contains(text(),'Password')]")
	WebElement passwordtab;
	
	@FindBy(xpath="//label[contains(text(),'Remember me?')]")
	WebElement Rememberme;
	
	@FindBy(xpath="//input[@id='Input_Email']")
	WebElement Emailinput;
	
	@FindBy(xpath="//input[@id='Input_Password']")
	WebElement passwordinput;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement Login;
	
	/*@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginTab;
	
	@FindBy(xpath="/Themes/Test/img/cicero-logo-white.png")
	WebElement logo;
	
	//@FindBy(xpath="//a[contains(text(),'Register')]")
	//WebElement registertab;
	
	@FindBy(xpath="//a[contains(text(),'File a Claim')]")
	WebElement Claimtab;
	
	@FindBy(xpath="//h3[contains(text(),'Log In')]")
	WebElement content1;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement usrename;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement SignupButton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement ForgetPasswordButton;
	
	@FindBy(xpath="//label[contains(@class,'custom-control-label')]")
	WebElement Rememberme;
	
	@FindBy(xpath="//input[@id='rememberMe']")
	WebElement Checkbox;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement Registerbtn;
	
	@FindBy(xpath="//div[@class='flex-grow-1 d-none d-lg-block']")
	WebElement searchclaim;
	
	@FindBy(xpath="//span[@id='Email-error']")
	WebElement EmailError;
	
	@FindBy(xpath="//span[@id='Password-error']")
	WebElement PasswordError;
	
	@FindBy(xpath="/uploads/default-avatar.jpg")
	WebElement Profile;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement Logout;
	*/
	
	/*public void clickLogin()
	{
		loginTab.click();
		
	}
	*/
	
	
	public String UsernameTab()
	{
		return usrenametab.getText();	
	}
	
	public String PasswordTab()
	{
		return passwordtab.getText();
	}
	
	
	
	public void loginCicero(String userName, String passWord)
	{
		Emailinput.clear();
		Emailinput.sendKeys(userName);
		passwordinput.clear();
		passwordinput.sendKeys(passWord);
		Login.click();	
		
	}
	
}
