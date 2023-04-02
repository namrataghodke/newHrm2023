package pomPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkBox {
	
		
	
@FindBy(xpath="//span[text()='Check Box']")	
private WebElement check;
	
@FindBy(xpath="//span[@class='rct-checkbox']")
private WebElement checkBox;
	


public checkBox(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}


public void clickonCheckButton()
{
	
	check.click();
}



public void clickOnCkackBox() 
{
	
	checkBox.click();	
	
}








}
