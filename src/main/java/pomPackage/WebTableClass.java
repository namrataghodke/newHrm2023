package pomPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableClass {
	JavascriptExecutor js;	
	WebDriver driver;
    List<WebElement> tabledata;
    Robot r;
	
@FindBy(xpath="//span[text()='Web Tables']")
private WebElement webTableData;
	
@FindBy(xpath="//button[text()='Add']")
private WebElement addBtton;

@FindBy(xpath="//input[@id='firstName']")
private WebElement firstname;

@FindBy(xpath="//input[@id='lastName']")
private WebElement lastName;

@FindBy(xpath="//input[@id='userEmail']")
private WebElement userId;

@FindBy(xpath="//input[@id='age']")
private WebElement agebox;

@FindBy(xpath="//input[@id='salary']")
private WebElement salaryBox;

@FindBy(xpath="//input[@id='department']")
private WebElement departmentBox;

@FindBy(xpath="//button[@id='submit']")
private WebElement submitButton;


@FindBy(xpath="//div[@class='ReactTable -striped -highlight']//div")
private WebElement webTable;

@FindBy(xpath="//span[text()='Upload and Download']")
private WebElement fileUpload;

@FindBy(xpath="//input[@id='uploadFile']")
private WebElement chooseFile;

@FindBy(xpath="//a[text()='Download']")
private WebElement downlod;




public WebTableClass(WebDriver driver) throws AWTException
{
	PageFactory.initElements(driver,this);
     js=( JavascriptExecutor)driver;
     r= new Robot(); 
    
    
     
}


public void clickWebTable() {
	
	js.executeScript("arguments[0].scrollIntoView(true)", webTableData);
	webTableData.click();
	 
}


public void clickOnAddButton()
{
	addBtton.click();
}


public void sendKeysFirstName(String fname)
{
	firstname.sendKeys(fname);
}


public void sendKeysLastName(String lname) {
	
	lastName.sendKeys(lname);
	
}

public void sendKeysUserId(String email) {
	
	userId.sendKeys(email);
	
}


public void sendKeysAge(String Age) {
	
	agebox.sendKeys(Age);
}

public void sendKeysSalary(String salary) throws InterruptedException
{
	Thread.sleep(1000);
	salaryBox.sendKeys(salary);
}

public void sendKeysDepartment(String depart)
{
	departmentBox.sendKeys(depart);
}


public void clickOnSub()
{
	submitButton.click();
}

public void fetchData() {
	
	webTable.click();
	
}


public void data(int i1) {
	
	tabledata=driver.findElements(By.xpath("//div[@class='ReactTable -striped -highlight']//div"));
	for( i1=0; i1<tabledata.size(); i1++)
	{
		
	WebElement a=tabledata.get(i1);
	System.out.println(a.getText());
	}
	
	
}



public void clickOnFileUpload() throws InterruptedException
{ 
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView(true)",fileUpload);
	
	fileUpload.click();
}

public void clickOnChoose() throws InterruptedException
{
	//chooseFile.click();
	js.executeScript("arguments[0].click()",chooseFile);
	Thread.sleep(2000);

	StringSelection ss=new StringSelection("C:\\Users\\Expert\\Desktop\\SSR_2021-22.xlsx");
	
	//StringSelection ss=new StringSelection("C:"+File.separator+"Users"+File.separator+"Expert"+File.separator+"eclipse-workspace"+File.separator+"DEMOQA1"+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"ExcelFile"+File.separator+"Book1.xlsx.xlsx");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_ENTER);
	
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	//chooseFile.click();
}

public void downloadFile()
{
	downlod.click();
}











}
