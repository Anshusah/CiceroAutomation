package checkBox;

import java.io.IOException;

import org.apache.commons.math3.stat.inference.TestUtils;
import org.openqa.selenium.By;

import Base.TestBase;

//import com.hAIbooks.qa.Base.TestBase;
//import com.hAIbooks.qa.Times.TestUtils;

public class SelectCheckBox extends TestBase
{

	public SelectCheckBox() throws IOException 
	{
		super();
	}
	
	public void ClcikCheckBox()
	{
		
		try
		{
			//Thread.sleep(TestUtils.Thread_sleep);
			driver.findElement(By.xpath("//label[@class='agree-label']")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
	
		}
	}

}
