package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass {
	
	
	
public static String catureScreenShot(WebDriver driver) throws IOException {
	
	
	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
String path=System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"screenshot"+System.currentTimeMillis()+".png";
 
// String path= System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"Screenshot"+File.separator+System.currentTimeMillis()+".png";
 
 
	File dist=new File(path);
	FileHandler.copy(source, dist);
	
	return path;
	
}
}