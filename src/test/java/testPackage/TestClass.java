package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomPackage.TextBoxClass;
import testUtility.ReadableFileData;
import testUtility.ScrollBar;

public class TestClass extends BaseClass {
	
WebDriver driver;
TextBoxClass tBC;	
ReadableFileData r;


WebElement submitButton;



@BeforeSuite
public void beforeSuite()
{
	
}
	

	
@BeforeClass
public void beforeClass()
{
	
}

@BeforeMethod
public void beforeMetod()
{
	 tBC=new TextBoxClass(BaseClass.driver);
}

@Test
public void verifyTextBoxWithCorrectCredential() throws EncryptedDocumentException, IOException, InterruptedException
{
	
	tBC.expositionIsDispayed();	
	
	tBC.sendTextInFullName(r.fetchDataFromExcel(5,0));
	
	tBC.EmailIdSend(r.fetchDataFromExcel(5,1));
	
	tBC.sendAddress(r.fetchDataFromExcel(5,2));
	tBC.sendcurrentAdress(r.fetchDataFromExcel(5,3));
	tBC.clickOnButton();
	
	
}

@AfterMethod
public void afterMethod()
{
	
}

@AfterClass
public void afterClass()
{
	
}



@AfterSuite
public void afterSuite()
{
	
}








}
