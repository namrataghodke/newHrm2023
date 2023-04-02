package pomPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxClass {
	
JavascriptExecutor js;

@FindBy(xpath="//input[@id='userName']")	
private WebElement fullNameText;
	
@FindBy (xpath="//input[@id='userEmail']")
private WebElement emailText;
	
@FindBy (xpath="//textarea[@id='currentAddress']")
private WebElement AddressText;
	
@FindBy (xpath="//textarea[@id='permanentAddress']")
private WebElement perAddbox;

@FindBy (xpath="//button[text()='Submit']")
private WebElement submitButton;

@FindBy(xpath="//span[text()='Check Box']")	
private WebElement check;	
	
	
public TextBoxClass	(WebDriver driver) {
	
PageFactory.initElements(driver, this);	
 js=(JavascriptExecutor)driver;

	
	
}
	
	
public void expositionIsDispayed()	{
	
	fullNameText.isDisplayed();
}
	
public void sendTextInFullName(String name) {
	
	fullNameText.sendKeys(name);
	
	
}
	
public void EmailIdSend(String mail) {
	emailText.sendKeys(mail);
	
}
	
public void sendAddress(String address)	{
	
	AddressText.sendKeys(address);
}

public void sendcurrentAdress(String currentAdd)
{
	perAddbox.sendKeys(currentAdd);
}
	
public void clickOnButton() throws InterruptedException {
	
	js.executeScript("arguments[0].scrollIntoView(true)", check);
	Thread.sleep(1000);
	submitButton.click();
}
	
	
	
	
	
	
	
	
	
	
	

}
