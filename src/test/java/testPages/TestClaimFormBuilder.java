package testPages;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import excelReader.ExcelReader;
import pages.ClaimFormBuilder;
import pages.LoginPage;
import times.TestUtils;

public class TestClaimFormBuilder extends TestBase
{
	public TestClaimFormBuilder() throws IOException 
	{
		super();
		
	}
	ClaimFormBuilder formbuilder;
	
	LoginPage loginpage;
	ExcelReader excel;
	String ExcelPath=System.getProperty("user.dir")+"/TestData/FormDetails.xlsx";
	
	
	@BeforeClass
	public void SetUp() throws Exception
	{
		Intilization();
		formbuilder=new ClaimFormBuilder();
		loginpage=new LoginPage();
		excel= new ExcelReader(ExcelPath);
	
	}
	
	
	
	@Test(priority=1)
	public void getLoginToApplication()
	{
		loginpage.loginCicero(excel.getCellData(1, 0, 1), excel.getCellData(1, 1, 1));	
	}
	
	
	@Test(priority=2)
	public void CanClcikTooltab() throws InterruptedException, IOException
	{
		//new ClaimFormBuilder().ClcikTooltab();
		
		formbuilder.ClcikTooltab();
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=3)
	public void CanClcikFormBBuilder() throws InterruptedException
	{
		formbuilder.ClcikFormBBuilder();
		Thread.sleep(TestUtils.Thread_sleep);
	}
			
	@Test(priority=4)
	public void VerifyToverifyhomeBtn() throws InterruptedException
	{
		boolean flag=formbuilder.ToverifyhomeBtn();
		Assert.assertTrue(flag);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=5)
	public void VerifyToverifyConTent() throws InterruptedException
	{
		boolean flag=formbuilder.ToverifyConTent();
		Assert.assertTrue(flag);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=6)
	public void VerifyToverifysearchtab() throws InterruptedException
	{
		boolean flag=formbuilder.Toverifysearchtab();
		Assert.assertTrue(flag);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=7)
	public void CanClcikentriesnumber() throws InterruptedException
	{
		formbuilder.Clcikentriesnumber();
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=8)
	public void ToverifyColNameTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyColName();		
		Assert.assertEquals(Text, "Name");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=9)
	public void ToverifyColTenantTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyColTenant();		
		Assert.assertEquals(Text, "Tenant");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=10)
	public void ToverifyColCreatedTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyColCreated();		
		Assert.assertEquals(Text, "Created At");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=11)
	public void ToverifyColUpdatedTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyColUpdated();		
		Assert.assertEquals(Text, "Updated At");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=12)
	public void ToverifyColStatusTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyColStatus();		
		Assert.assertEquals(Text, "Status");	
		Thread.sleep(TestUtils.Thread_sleep);
		
	}
	@Test(priority=13)
	public void VerifyToverifyeditforms() throws InterruptedException
	{
		boolean flag=formbuilder.Toverifyeditforms();
		Assert.assertFalse(flag);;
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=14)
	public void CanClcikCreatebtn() throws InterruptedException
	{
		formbuilder.ClcikCreatebtn();
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=15)
	public void VerifyToverifyformbtn() throws InterruptedException
	{
		boolean flag=formbuilder.Toverifyformbtn();
		Assert.assertTrue(flag);
		//Assert.assertFalse(flag);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=16)
	public void ToverifyErrormsgTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyErrormsg();		
		Assert.assertEquals(Text, "No table are created in Database. Please create required Tables.");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=17)
	public void ToverifyStatusTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyStatus();		
		Assert.assertEquals(Text, "STATUS");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=18)
	public void VerifyToverifyActiveStatus() throws InterruptedException
	{
		boolean flag=formbuilder.ToverifyActiveStatus();
		Assert.assertFalse(flag);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=19)
	public void submitButtonTest() throws InterruptedException 
	{
		
		formbuilder.submitButton(excel.getCellData(0, 0, 1));	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	
	/*@Test(priority=20)
	public void CanClcikSettingbtn() throws InterruptedException
	{
		formbuilder.ClcikSettingbtn();
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=21)
	public void CanClciklftnavigation() throws InterruptedException
	{
		formbuilder.Clciklftnavigation();
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=22)
	public void ToverifyMdlNameTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyMdlName();		
		Assert.assertEquals(Text, "Model Name");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=23)
	public void ToverifyMdlTitleTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyMdlTitle();		
		Assert.assertEquals(Text, "Model Title");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=24)
	public void ToverifyMdlURLTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyMdlURL();		
		Assert.assertEquals(Text, "Url Slug");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=25)
	public void ToverifyMdliconTest() throws InterruptedException
	{
		String Text=formbuilder.ToverifyMdlicon();		
		Assert.assertEquals(Text, "Icon");	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=26)
	public void submitnavigationTest(String mname, String mtitle) throws InterruptedException 
	{
		formbuilder.submitnavigation(excel.getCellData(2, 0, 1), excel.getCellData(2, 1, 1));	
		Thread.sleep(TestUtils.Thread_sleep);
		
	}
	
	@Test(priority=27)
	public void submitnavigation1(String murl, String micon) throws InterruptedException 
	{
		formbuilder.submitnavigation1(excel.getCellData(2, 2, 1), excel.getCellData(2, 3, 1));	
		Thread.sleep(TestUtils.Thread_sleep);
	}*/
	
	@Test(priority=28)
	public void DraganddropparagraphTest() throws InterruptedException
	{
		formbuilder.draganddropparagraph();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=29)
	public void DraganddropparamediaTest() throws InterruptedException
	{
		formbuilder.draganddropmedia();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=30)
	public void DraganddroptextareaTest() throws InterruptedException
	{
		formbuilder.draganddroptextarea();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=31)
	public void DraganddropnumberTest() throws InterruptedException
	{
		formbuilder.draganddropnumber();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=32)
	public void DraganddropcheckboxTest() throws InterruptedException
	{
		formbuilder.draganddropcheckbox();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=33)
	public void DraganddroptextboxTest() throws InterruptedException
	{
		formbuilder.draganddroptextbox();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=34)
	public void DraganddropselectboxTest() throws InterruptedException
	{
		formbuilder.draganddropselectbox();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=35)
	public void DraganddropheadingTest() throws InterruptedException
	{
		formbuilder.draganddropheading();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=36)
	public void GridVisibleTest() throws InterruptedException
	{
		formbuilder.GridVisible();			
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	@Test(priority=37)
	public void FirstElementTest() throws InterruptedException
	{
		formbuilder.FirstElement();		
			
		Thread.sleep(TestUtils.Thread_sleep);
	}
	/*@Test(priority=14)
	public void MinimumCharacterValidationPassworsTest()
	{
		String Text=advisior.MinimumCharacterValidationPasswors();
		
		if(Text.contentEquals("Must be at least 6 characters long, and contain at least one uppercase letter, "
				+ "one lowercase letter and one number"))
		{
			System.out.println("Validation Text is Displayed");
		}
		else
		{
			System.out.println("Validation Text is not displayed");
		}
	}
	
	
	@Test(priority=12)
	public void MaximumCharacterValidationPaaswordTest()
	{
		int size=advisior.MaximumCharacterValidationPaasword();
		

		if (size == 100) {
			System.out.println("Maximum limitation of Character in Password Text box is set ");
		}
 
		else {
			System.out.println("Maximum limitation of Character in Password Text box is not set");
		}
		
		
	}
	
	
	@Test(priority=13)
	public void CharacterLimitationFirstNameTest()
	{
		int size=advisior.CharacterLimitationFirstName();
		if(size==50)
		{
			System.out.println("Maximum limitation of Character in First Name Text box is set ");
		}
		else 
		{
			System.out.println("Maximum limitation of Character in First Name Text box is  not set ");
		}
	}
	
	
	@Test(priority=14)
	public void CharacterLimitationLastNameTest()
	{
		int size=advisior.CharacterLimitationLastName();
		if(size==50)
		{
			System.out.println("Maximum limitation of Character in Last Name Text box is set ");
		}
		else 
		{
			System.out.println("Maximum limitation of Character in Last Name Text box is  not set ");
		}
	}
	
	@Test(priority=15)
	public void ClearSignUpPageTest() throws InterruptedException
	{
		advisior.ClearSignUpPage();	
		Thread.sleep(TestUtils.Thread_sleep);
	}
	
	@Test(priority=16)
	public void ClickGetStartedTest()
	{
		advisior.ClickGetStarted();
	}
	
	@Test(priority=17)
	public void ErrorMessageFirstNameTest()
	{
		String Text=advisior.ErrorMessageFirstName();		
		Assert.assertEquals(Text, "Please enter First Name");	
		
	}
	
	@Test(priority=18)
	public void ErrorMessageLastNameTest()
	{
		String Text=advisior.ErrorMessageLastName();
		Assert.assertEquals(Text, "Please enter Last Name");	
	}
	
	@Test(priority=19)
	public void ErrorMessageEmailIDTest()
	{
		String Text=advisior.ErrorMessageEmailID();
		Assert.assertEquals(Text, "Please enter Email");
	}
	
	@Test(priority=20)
	public void ErrorMessagePhoneNumTest()
	{
		String Text=advisior.ErrorMessagePhoneNum();
		Assert.assertEquals(Text, "Please enter Phone Number");
	}
	
	@Test(priority=21)
	public void ErrorCreatePasswordTest()
	{
		String Text=advisior.ErrorCreatePassword();
		Assert.assertEquals(Text, "Please create Password");
		
	}
	
	@Test(priority=22)
	public void ErrorConfirmPasswordTest()
	{
		String Text=advisior.ErrorConfirmPassword();
		Assert.assertEquals(Text, "Please confirm password");
	}
	
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
*/
}
