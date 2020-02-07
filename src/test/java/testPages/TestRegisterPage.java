package testPages;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import checkBox.SelectCheckBox;
import emailVerification.EmailVerification;
import excelReader.ExcelReader;
import newTab.CreatingNewTab;
import pages.LoginPage;
import pages.RegisterPage;
import screenShots.ScreenShot;
import sikuli.Sikuli;
import times.TestUtils;

public class TestRegisterPage extends TestBase
{
	LoginPage loginpage;
	ScreenShot screenshot;
	RegisterPage owner;
	EmailVerification emailVerification;
	SelectCheckBox check;
	CreatingNewTab newTab;
	Sikuli sikuli;
	ExcelReader excel;
	String ExcelPath=System.getProperty("user.dir")+"/TestData/BusinessOwner.xlsx";
	public TestRegisterPage() throws IOException 
	{
		super();
		
	}
	
	@BeforeClass
	public void SetUp() throws IOException, InterruptedException
	{
		Intilization();
		owner= new RegisterPage();
		excel=new ExcelReader(ExcelPath);
		check=new SelectCheckBox();
		newTab=new CreatingNewTab();
		sikuli=new Sikuli();
		emailVerification=new EmailVerification();	
		screenshot=new ScreenShot();
		loginpage=new LoginPage();
		
		
		Thread.sleep(TestUtils.PAGE_LOAD_TIMEOUT);
	}
	
	@Test(priority=1)
	public void clickRegisterTest()
	{
		owner.clickRegister();
		
	}
	@Test(priority=2)
	public void LogoTest()
	{
		boolean flag=owner.Logo();
		Assert.assertEquals(flag, true, "Cicero logo is not displayed");
	}
	
	@Test(priority=3)
	public void ContentTextTest()
	{
		String actualOutput=owner.Content();
		String expectedOutput="Create New Account";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
	}
	
	@Test(priority=4)
	public void clickSignUpTest()
	{
		owner.clickSignUp();
		
	}
	@Test(priority=5)
	public void FirstNameErrorTest()
	{
		String actualOutput=owner.FirstNameError();
		String expectedOutput="Please Enter First Name.";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
	}
	@Test(priority=6)
	public void LastNameErrorTest()
	{
		String actualOutput=owner.LastNameError();
		String expectedOutput="Please Enter Last Name.";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
	}
	@Test(priority=7)
	public void EmailErrorTest()
	{
		String actualOutput=owner.EmailError();
		String expectedOutput="The Email Address field is required.";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
	}
	@Test(priority=8)
	public void PasswordErrorTest()
	{
		String actualOutput=owner.PasswordError();
		String expectedOutput="Please Enter Password.";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
	}
	
	@Test(priority=9)
	public void canGetFristNameAndLastName() 
	{
		String firstName=excel.getCellData(0, 1, "FirstName");
		String lasttName=excel.getCellData(0, 1, "LastName");
		owner.getName(firstName, lasttName);
		
	}
	
	@Test(priority=10)
	public void canGetEmail()
	{
		String emailId=excel.getCellData(0, 1, "EmailAddress");
		//String phoneNumber=excel.getCellData(0, 1, "PhoneNumber");
		owner.getEmail(emailId);				
	}
	
	@Test(priority=11)
	public void canSetWrongPassword()
	{
		String passWord=excel.getCellData(0, 1, "Password");
		String confirmPassword=excel.getCellData(0, 1, "ConfirmPassword");
		owner.getPassword(passWord, confirmPassword);		
	}
	
	@Test(priority=12)
	public void ConfirmPasswordErrorTest()
	{
		String actualOutput=owner.ConfirmPasswordError();
		String expectedOutput="Confirm password doesn't match, Type again !";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
	}
	
	@Test(priority=13)
	public void GetFristNameAndLastNameTest() 
	{
		String firstName=excel.getCellData(0, 1, "FirstName");
		String lasttName=excel.getCellData(0, 1, "LastName");
		owner.getName(firstName, lasttName);
		
	}
	
	@Test(priority=9)
	public void GetEmailTest()
	{
		String emailId=excel.getCellData(0, 1, "EmailAddress");
		//String phoneNumber=excel.getCellData(0, 1, "PhoneNumber");
		owner.getEmail(emailId);				
	}
	
	@Test(priority=10)
	public void PasswordTest()
	{
		String passWord=excel.getCellData(0, 1, "Password");
		String confirmPassword=excel.getCellData(0, 1, "ConfirmPassword");
		owner.getPassword(passWord, confirmPassword);		
	}
	
	@Test(priority=4)
	public void clickSignUp()
	{
		owner.clickSignUp();
		
	}
	@Test(priority=9)
	public void emailVerificationPage() throws IOException, InterruptedException
	{
		screenshot.getScreenshot("emailVerificationPage");
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=10)
	public void openNewTab() throws Exception
	{
		
		
		String emailAdd=excel.getCellData(0, 1, "EmailAddress");
		newTab.OpenNewTab();
		newTab.switchToNewTab(emailAdd);
		Thread.sleep(TestUtils.PAGE_LOAD_TIMEOUT);
		sikuli.Activation();
		newTab.InsertTabNumToSwith(2);	
	}
	
	
	
	
	/*@Test(priority=11)
	public void loginhAIbooks() throws InterruptedException
	{
		String UN=excel.getCellData(0, 1, "EmailAddress");
		String pwd=excel.getCellData(0, 1, "Password");
				
		owner.loginhAIbooks(UN, pwd);
		Thread.sleep(TestUtils.PAGE_LOAD_TIMEOUT);
	}
	
	@Test(priority=12)
	public void canVerifyuserLogin() throws InterruptedException
	{
		Thread.sleep(TestUtils.Thread_sleep);
		String actualOutput =loginpage.VerifyUserLogin();
		String expectedOutput="Hello, Alex";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
		Thread.sleep(TestUtils.PAGE_LOAD_TIMEOUT);
	}
	
	@Test(priority=13)
	public void canuserlogOut() throws InterruptedException
	{
		loginpage.clickUserLogout();
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}*/
	
	
	
	
	
	
}
