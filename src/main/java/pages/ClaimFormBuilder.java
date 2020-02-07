package pages;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import times.TestUtils;
import draganddrop.DragandDrop;
import excelReader.ExcelReader;
import Base.TestBase;
public class ClaimFormBuilder extends TestBase
{
	ExcelReader excel;
	String ExcelPath=System.getProperty("user.dir")+"/TestData/FormDetails.xlsx";
	public ClaimFormBuilder() throws IOException 
	{
		PageFactory.initElements(driver, this);
		excel= new ExcelReader(ExcelPath);
	}
	
	
	/*********
	 * Web Element of Get Started
	 */
	@FindBy(xpath="//span[contains(text(),'Tools')]")
	WebElement Tooltab;
	
	@FindBy(xpath="//ul[@id='menutools']//li[1]")
	WebElement FormBuilder;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homeBtn;
	
	@FindBy(xpath="//h3[contains(text(),'Manage Forms')]")
	WebElement conTent;
	
	@FindBy(xpath="//a[contains(text(),' Create New')]")
	WebElement Createbtn;
	
	@FindBy(xpath="//select[@id='action']")
	WebElement Action;
	
	@FindBys(@FindBy(xpath="//select[@id='action']//option"))
	 private List<WebElement> ActionList;
	
	@FindBy(xpath="//button[@name='apply']")
	WebElement Applybtn;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchtab;
	
	@FindBy(xpath="//select[@name='builder-forms_length']")
	WebElement entriesnumber;
	
	@FindBys(@FindBy(xpath="//select[@name='builder-forms_length']//option[1]"))
	WebElement entriesnumber1; 
	
	@FindBys(@FindBy(xpath="//select[@name='builder-forms_length']//option[2]"))
	WebElement entriesnumber2;
	
	@FindBys(@FindBy(xpath="//select[@name='builder-forms_length']//option[3]"))
	WebElement entriesnumber3;
	
	@FindBys(@FindBy(xpath="//select[@name='builder-forms_length']//option[4]"))
	WebElement entriesnumber4;
	
	@FindBys(@FindBy(xpath="//select[@name='builder-forms_length']//option[5]"))
	WebElement entriesnumber5;
	
	@FindBy(xpath="//th[contains(text(),'Name')]")
	WebElement ColName;
	
	@FindBy(xpath="//th[contains(text(),'Tenant')]")
	WebElement ColTenant;
	
	@FindBy(xpath="//th[contains(text(),'Created At')]")
	WebElement ColCreated;
	
	@FindBy(xpath="//th[contains(text(),'Updated At')]")
	WebElement ColUpdated;
	
	@FindBy(xpath="//th[contains(text(),'Status')]")
	WebElement ColStatus;
	
	@FindBy(xpath="//a[@title='Edit Form']")
	WebElement editforms;
	
	@FindBy(xpath="//a[contains(text(),'Forms')]")
	WebElement formbtn;
	
	@FindBy(xpath="//div[contains(text(),'No table are created in Database. Please create required Tables.')]")
	WebElement formcontent;
	
	@FindBy(xpath="//label[contains(text(),'Status')]")
	WebElement Status;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement ActiveStatus;
	
	@FindBy(xpath="//span[@id='editName']")
	WebElement FormNameEdit;
	
	
	@FindBy(xpath="//input[@id='Name']")
	WebElement Formname;
	
	@FindBy(xpath="//button[@id='save-all']")
	WebElement Savebtn;
	
	@FindBy(xpath="//a[@title='Form settings']")
	WebElement Settingbtn;
	
	@FindBy(xpath="//header[contains(text(),'Left Navigation')]")
	WebElement lftnavigation;
	
	@FindBy(xpath="//label[contains(text(),'Model Name')]")
	WebElement mdlnamelbl;
	
	@FindBy(xpath="//label[contains(text(),'Model Title')]")
	WebElement mdltitlelbl;
	
	@FindBy(xpath="//label[contains(text(),'Url Slug')]")
	WebElement urlsluglbl;
	
	@FindBy(xpath="//label[contains(text(),'Icon')]")
	WebElement iconlbl;
	
	@FindBy(xpath="//input[@name='Forms[Navigations][Name]']")
	WebElement mdlnameinput;
	
	@FindBy(xpath="//input[@name='Forms[Navigations][Title]']")
	WebElement mdltitleinput;
	
	@FindBy(xpath="//input[@name='Forms[Navigations][Identifier]']")
	WebElement mdlurlinput;
	
	@FindBy(xpath="//input[@name='Forms[Navigations][Icon]']")
	WebElement mdliconinput;
	
	@FindBy(xpath="//header[contains(text(),'Database Setting')]")
	WebElement databasestng;
	
	@FindBy(xpath="//div[@class='ps__thumb-y']")
	WebElement scroll;
	
	@FindBy(xpath="//li[@class='active nav-item']")
	WebElement databasetab;
	
	@FindBy(xpath="//label[contains(text(),'Name')]")
	WebElement tablenametab;
	
	@FindBy(xpath="//input[@name='Forms[Tables][0][Name]']")
	WebElement tablenameinput;
	
	@FindBy(xpath="//th[contains(text(),'Field Name')]")
	WebElement fieldnametab;
	
	@FindBy(xpath="//th[contains(text(),'Field Type')]")
	WebElement fieldtypetab;
	
	@FindBy(xpath="//label[contains(text(),'Size')]")
	WebElement sizetab;
	
	@FindBy(xpath="//label[contains(text(),'Default')]")
	WebElement defaulttab;
	
	@FindBy(xpath="//label[contains(text(),'Nullable')]")
	WebElement nullabletab;
	
	@FindBy(xpath="//label[contains(text(),'Primary Key')]")
	WebElement primarykeytab;
	
	@FindBy(xpath="//a[@title='Copy row']")
	WebElement Copyfield;
	
	@FindBy(xpath="//a[@class='fc-icon icon-delete']")
	WebElement delfield;
	
	@FindBy(xpath="//input[@name='Forms[Tables][0][Fields][0][Name]']")
	WebElement nameinput;
	
	@FindBy(xpath="//select[@name='Forms[Tables][0][Fields][0][Type]']")
	WebElement fieldtypeinput;
	
	@FindBy(xpath="//input[@name='Forms[Tables][0][Fields][0][Size]']")
	WebElement sizeinput;
	
	@FindBy(xpath="//input[@name='Forms[Tables][0][Fields][0][Default]']")
	WebElement defaultinput;
	
	//UI Elements
	@FindBy(xpath="//span[contains(text(),'CheckBoxGroup')]")
	WebElement checkboxelement;
	
	@FindBy(xpath="//span[contains(text(),'Textbox Field')]")
	WebElement textboxelement;
	
	@FindBy(xpath="//span[contains(text(),'Number Field')]")
	WebElement numberelement;
	
	@FindBy(xpath="//span[contains(text(),'RadioGroup')]")
	WebElement radioelement;
	
	@FindBy(xpath="//span[contains(text(),'Heading')]")
	WebElement headingelement;
	
	@FindBy(xpath="//span[contains(text(),'Paragraph')]")
	WebElement paragraphelement;
	
	@FindBy(xpath="//span[contains(text(),'SelectBox Field')]")
	WebElement selectboxelement;
	
	@FindBy(xpath="//span[contains(text(),'MultiSelectBox Field')]")
	WebElement multiselectelement;
	
	@FindBy(xpath="//span[contains(text(),'TextArea Field')]")
	WebElement textareaelement;
	
	@FindBy(xpath="//span[contains(text(),'Media')]")
	WebElement mediaelement;
	
	@FindBy(xpath="//span[contains(text(),'Add Tab')]")
	WebElement addtabbtn;
	
	@FindBy(xpath="//div[@id='fb-tab-0']//ul")
	WebElement receiver;
	
	@FindBy(xpath="//a[@id='dropdownTabButton']")
	WebElement gridtab;
	
	@FindBy(xpath="//div[@class='dropdown-item']//label")
	WebElement gridvisible;
	
	@FindBy(xpath="//div[@class='fb-elements-container ui-sortable']//div[1]")
	WebElement Firstelement;
	
	@FindBy(xpath="//div[@class='fb-element-wrap']//a//i[@class='ri-settings-3-fill']")
	WebElement Firstsetting;
	
	
	@FindBy(xpath="//input[@name='FrontendLabel']")
	WebElement lebelinputfe;
	
	@FindBy(xpath="//header[contains(text(),'Backend Setting')]")
	WebElement besetting;
	
	@FindBy(xpath="//input[@name='BackendLabel']")
	WebElement lebelinputbe;
	
	@FindBy(xpath="//textarea[@name='HeaderText']")
	WebElement headinginput;
	
	@FindBy(xpath="//textarea[@name='ParagraphText']")
	WebElement paragraphinput;
	
	@FindBy(xpath="//header[contains(text(),'Developer Options')]")
	WebElement developeroption;
	
	
	/*@FindBy(xpath="//input[@id='numBackendLabel']")
	WebElement lebelinputbe;*/
	
	
	public void ClcikTooltab()
	{
		//Actions act = new Actions(driver);
		//WebElement scroll = driver.findElement(By.xpath("//div[@class='ps__thumb-y']"));
		//act.clickAndHold(scroll).moveByOffset(40, 0).release().perform();
		scroll.sendKeys(Keys.PAGE_DOWN);
		Tooltab.click();
		
	}
	public void ClcikFormBBuilder()
	{
		FormBuilder.click();
	}
	public boolean ToverifyhomeBtn()
	{
		return homeBtn.isDisplayed();
	}
	public boolean ToverifyConTent()
	{
		return conTent.isDisplayed();
	}
	public void ClcikAction()
	{
		Action.click();
	}
	public boolean Toverifysearchtab()
	{
		return searchtab.isDisplayed();
	}
	public void Clcikentriesnumber() throws InterruptedException
	{
		entriesnumber.click();
		entriesnumber1.click();
		Thread.sleep(TestUtils.Thread_sleep);
		entriesnumber.click();
		entriesnumber2.click();
		Thread.sleep(TestUtils.Thread_sleep);
		entriesnumber.click();
		entriesnumber3.click();
		Thread.sleep(TestUtils.Thread_sleep);
		entriesnumber.click();
		entriesnumber4.click();
		Thread.sleep(TestUtils.Thread_sleep);
		entriesnumber.click();
		entriesnumber5.click();
		Thread.sleep(TestUtils.Thread_sleep);
	}
	public String ToverifyColName()
	{
		return ColName.getText();
	}
	public String ToverifyColTenant()
	{
		return ColTenant.getText();
	}
	public String ToverifyColCreated()
	{
		return ColCreated.getText();
	}
	public String ToverifyColUpdated()
	{
		return ColUpdated.getText();
	}
	public String ToverifyColStatus()
	{
		return ColStatus.getText();
	}
	public boolean Toverifyeditforms()
	{
		return editforms.isDisplayed();
	}
	public void ClcikCreatebtn()
	{
		Createbtn.click();
	}
	public boolean Toverifyformbtn()
	{
		return formbtn.isDisplayed();
	}
	public String ToverifyErrormsg()
	{
		return formcontent.getText();
	}
	public String ToverifyStatus()
	{
		return Status.getText();
	}
	public boolean ToverifyActiveStatus()
	{
		return ActiveStatus.isDisplayed();
	}
	public void submitButton(String frmname) throws InterruptedException
	 {
		FormNameEdit.click();
		Thread.sleep(TestUtils.Thread_sleep);
		Formname.clear();
		Formname.sendKeys(frmname);
		Thread.sleep(TestUtils.Thread_sleep);
		Savebtn.click();
	 }
	public void ClcikSettingbtn()
	{
		Settingbtn.click();
	}
	public void Clciklftnavigation()
	{
		lftnavigation.click();
	}
	public String ToverifyMdlName()
	{
		return mdlnamelbl.getText();
	}
	public String ToverifyMdlTitle()
	{
		return mdltitlelbl.getText();
	}
	public String ToverifyMdlURL()
	{
		return urlsluglbl.getText();
	}
	public String ToverifyMdlicon()
	{
		return iconlbl.getText();
	}
	public void submitnavigation(String mname, String mtitle) throws InterruptedException
	 {
		mdlnameinput.sendKeys(mname);
		Thread.sleep(TestUtils.Thread_sleep);
		mdltitleinput.sendKeys(mtitle);
	 }
	public void submitnavigation1(String murl, String micon) throws InterruptedException
	 {
		mdlurlinput.sendKeys(murl);
		Thread.sleep(TestUtils.Thread_sleep);
		mdliconinput.sendKeys(micon);
	 }
	public void Clcikdatabasesetting()
	{
		databasestng.click();
	}
	public void draganddropparagraph() throws InterruptedException
	{
		DragandDrop.DragAndDrop(paragraphelement, receiver);
		Thread.sleep(TestUtils.Thread_sleep);	
	}
		
	
	public void draganddropmedia() throws InterruptedException 
	{
		DragandDrop.DragAndDrop(mediaelement, receiver);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	public void draganddroptextarea() throws InterruptedException 
	{
		DragandDrop.DragAndDrop(textareaelement, receiver);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	public void draganddropnumber() throws InterruptedException 
	{
		DragandDrop.DragAndDrop(numberelement, receiver);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	public void draganddropcheckbox() throws InterruptedException 
	{
		DragandDrop.DragAndDrop(checkboxelement, receiver);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	public void draganddroptextbox() throws InterruptedException 
	{
		DragandDrop.DragAndDrop(textboxelement, receiver);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	public void draganddropselectbox() throws InterruptedException 
	{
		DragandDrop.DragAndDrop(selectboxelement, receiver);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	public void draganddropheading() throws InterruptedException 
	{
		DragandDrop.DragAndDrop(headingelement, receiver);
		Thread.sleep(TestUtils.Thread_sleep);
	}
	public void GridVisible()
	{
		gridtab.click();
		gridvisible.click();
	}
	
	public void FirstElement() throws InterruptedException
	{
		Actions action= new Actions(driver);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='fb-elements-container ui-sortable']/div"));
		int count=ele.size();
		System.out.println(count);
		for(int i=0;i<count-1;i++)
		{
			String id=ele.get(i).getAttribute("data-element-id");
			System.out.println(id);
			WebElement element=driver.findElement(By.xpath("//div[@class='fb-elements-container ui-sortable']/div[@data-element-id="+id+"]"));
			action.moveToElement(element).click().build().perform();
			WebElement element1=driver.findElement(By.xpath("//div[@class='fb-elements-container ui-sortable']/div[@data-element-id="+id+"]//i"));
			action.click(element1).build().perform();
			Thread.sleep(TestUtils.Thread_sleep);
			WebElement modaltitle=driver.findElement(By.xpath("//div[@class='fb-elements-container ui-sortable']/div[@data-element-id="+id+"]/div/div/div//form/div/div"));
			String title=modaltitle.getText();
			System.out.println(title);
			switch (title)
			{
			case "Number Setting"
+ "This settings helps you to customize Number.":
				//title="Number Setting";
				numberElement();
				break;
			case "CheckBox Group Setting":
				//title="CheckBox Group Setting";
				checkboxElement();
				break;
			case "Heading Setting":
				//title="Heading Setting";
				headingElement();
				break;
			case "SelectBox Setting":
				//title="SelectBox Setting";
				selectboxElement();
				break;
			case "Textbox Setting":
				//title="Textbox Setting";
				textboxElement();
				break;
			case "TextArea Setting":
				//title="TextArea Setting";
				textareaElement();
				break;
			case "Media Setting":
				//title="Media Setting";
				mediaElement();
				break;
			case "Pragraph Setting":
				//title="Pragraph Setting";
				paragraphElement();
				break;
			case "Radio Group Setting":
				//title="Radio Group Setting";
				radioElement();
				break;
			case "MultiSelectBox Setting":
				//title="MultiSelectBox Setting";
				multiselectElement();
				break;
			}
			driver.findElement(By.xpath("//div[@class='fb-elements-container ui-sortable']/div[@data-element-id="+id+"]/div/div/div/div//a[2]")).click();
			Thread.sleep(TestUtils.Thread_sleep);
			
		}
		
		
		
		//Firstsetting.click();
	}
	public void numberElement()
	{
		//lebelinputfe.sendKeys(excel.getCellData(3, 0, 1));
		besetting.click();
		//lebelinputbe.sendKeys(excel.getCellData(3, 1, 1));
		developeroption.click();
	}
	public void checkboxElement()
	{
		//lebelinputfe.sendKeys(excel.getCellData(3, 0, 1));
		besetting.click();
		//lebelinputbe.sendKeys(excel.getCellData(3, 1, 1));
		developeroption.click();
	}
	public void headingElement()
	{
		//headinginput.sendKeys(excel.getCellData(3, 0, 1));
	}
	public void selectboxElement()
	{
		//lebelinputfe.sendKeys(excel.getCellData(3, 0, 1));
		besetting.click();
		//lebelinputbe.sendKeys(excel.getCellData(3, 1, 1));
		developeroption.click();
	}
	public void textboxElement()
	{
		//lebelinputfe.sendKeys(excel.getCellData(3, 0, 1));
		besetting.click();
		//lebelinputbe.sendKeys(excel.getCellData(3, 1, 1));
		developeroption.click();
	}
	public void textareaElement()
	{
		//lebelinputfe.sendKeys(excel.getCellData(3, 0, 1));
		besetting.click();
		//lebelinputbe.sendKeys(excel.getCellData(3, 1, 1));
		developeroption.click();
	}
	public void mediaElement()
	{
		//lebelinputfe.sendKeys(excel.getCellData(3, 0, 1));
		besetting.click();
		//lebelinputbe.sendKeys(excel.getCellData(3, 1, 1));
		developeroption.click();
	}
	public void paragraphElement()
	{
		//paragraphinput.sendKeys(excel.getCellData(3, 0, 1));
		
	}
	public void radioElement()
	{
		//lebelinputfe.sendKeys(excel.getCellData(3, 0, 1));
		besetting.click();
		//lebelinputbe.sendKeys(excel.getCellData(3, 1, 1));
		developeroption.click();
	}
	public void multiselectElement()
	{
		//lebelinputfe.sendKeys(excel.getCellData(3, 0, 1));
		besetting.click();
		//lebelinputbe.sendKeys(excel.getCellData(3, 1, 1));
		developeroption.click();
	}
}
