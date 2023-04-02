package testPackage;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.RadioButtonClass;
import pomPackage.WebTableClass;
import pomPackage.checkBox;
import testUtility.ReadableFileData;

public class TestClassCheckBox extends BaseClass {
	
checkBox cb;	
RadioButtonClass rBC;
WebTableClass Wt;
ReadableFileData r;	
int i;


@BeforeMethod
public void beforeMethod() throws AWTException {

	 cb=new checkBox(driver);
	 rBC=new RadioButtonClass(driver);
	 Wt=new WebTableClass(driver);
	
}
	
	
@Test
public void VerifyTheBox() {
	
	cb.clickonCheckButton();
	
	cb.clickOnCkackBox();	
	
	rBC.clickonRadioButton();
	rBC.clickOnRB();
}
	
@Test
public void verifyWebTable() throws EncryptedDocumentException, IOException, InterruptedException {
	
	Logger=report.createTest("verifyWebTable" );
	Wt.clickWebTable();
	
	Wt.clickOnAddButton();
	Wt.sendKeysFirstName(r.fetchDataFromExcel(6, 0));
	Wt.sendKeysLastName(r.fetchDataFromExcel(6, 1));
	Wt.sendKeysUserId(r.fetchDataFromExcel(6, 2));
	Wt.sendKeysAge(r.fetchDataFromExcel(6, 3));
	//Wt.sendKeysSalary(r.fetchDataFromExcel(6, 4));
	Wt.sendKeysSalary("1000");
	Wt.sendKeysDepartment(r.fetchDataFromExcel(6, 5));
	Wt.clickOnSub();
	Wt.fetchData();
	//Wt.data(i);
	
	Wt.clickOnFileUpload();
	Wt.clickOnChoose();
	Wt.downloadFile();
	
	Logger.pass("test case is pass");
}
	
	
	
	

}
