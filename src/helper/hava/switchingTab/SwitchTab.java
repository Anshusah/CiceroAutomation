package switchingTab;

import java.io.IOException;
import java.util.ArrayList;

import Base.TestBase;

//import java.io.IOException;
//import java.util.ArrayList;



public class SwitchTab extends TestBase
{
	public SwitchTab() throws IOException 
	{
		super();
		
	}

	public void switchtab(int tabNo)
	{
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
	    System.out.println(tabs.size());
	    driver.switchTo().window((String) tabs.get(tabNo)); 
	}
	

}
