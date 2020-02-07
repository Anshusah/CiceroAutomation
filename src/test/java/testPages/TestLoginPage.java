package testPages;
import java.io.IOException;

import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import excelReader.ExcelReader;
import pages.LoginPage;
//import times.TestUtils;
public class TestLoginPage extends TestBase
{

	
	public TestLoginPage() throws IOException 
	{
		super();
		
	}
	
	LoginPage loginpage;
	ExcelReader excel;
	String ExcelPath=System.getProperty("user.dir")+"/TestData/FormDetails.xlsx";
	
	
	@BeforeClass
	public void Setup() throws IOException
	{
		Intilization();
		loginpage=new LoginPage();
		excel= new ExcelReader(ExcelPath);
	}
	@Test(priority=1)
	public void UsernameTabTest()
	{
		String actualOutput=loginpage.UsernameTab();
		String expectedOutput="Email address";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
	}
	
	@Test(priority=4)
	public void passwordtabTest()
	{
		String actualOutput=loginpage.PasswordTab();
		String expectedOutput="Password";
		Assert.assertEquals(actualOutput, expectedOutput, "Actual and Expected outputs did not matched");
		
	}
	
	@DataProvider(name="testdata")
	 public Object[][] passData() 
	 {
	   excel=new ExcelReader(ExcelPath);
	   int rowsCount=excel.getRowCount(1);
	   Object[][] credentials= new Object[rowsCount][2];
			  
	   for(int i=1;i<rowsCount;i++)
	   {
			credentials[i][0]=excel.getCellData(1, i, "Username");
			credentials[i][1]=excel.getCellData(1, i, "Password");
				  
		}
		return credentials;
	  
	 }
	
	@Test(priority=8,dataProvider="testdata")
	public void loginCiceroTest(String UserName,String PassWord) 
	{
		loginpage.loginCicero(UserName, PassWord);	
		
	}
	
	
	
}
