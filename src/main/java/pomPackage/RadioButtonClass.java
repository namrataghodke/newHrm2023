package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonClass {
	
@FindBy(xpath="//span[text()='Radio Button']")
private WebElement radioButton;
	
@FindBy(xpath="//label[text()='Yes']")
private WebElement clickYes;


	
public RadioButtonClass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	


public void clickonRadioButton() {
	
	radioButton.click();
	 
}

public void clickOnRB()
{
	clickYes.click();
}



}
