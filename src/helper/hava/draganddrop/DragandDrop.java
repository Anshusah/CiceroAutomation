package draganddrop;

import java.io.IOException;
//import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import times.TestUtils;
import Base.TestBase;
public class DragandDrop extends TestBase
{
	public DragandDrop() throws IOException 
	{
		super();
		
	}
	public static void DragAndDrop(WebElement xpath1, WebElement xpath2)
	{
		Actions action= new Actions(driver);
		action.clickAndHold(xpath1).moveToElement(xpath2).release().build().perform();
	
	}
}
