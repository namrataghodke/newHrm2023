package testUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollBar {
	
static WebDriver driver;	
	
public static void scrollBarOpration(WebElement submitButton)	{
	
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true)", submitButton);
	
	
}
	
	
	
	
	
	
	
	
	

}
