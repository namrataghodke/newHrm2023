package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBrowser {
static WebDriver driver;	
	
public static WebDriver browserLunching(String browserName,String URL)
{
	if(browserName.equalsIgnoreCase("Chrome"))
	{
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(options);
	}
	else if(browserName.equalsIgnoreCase("egde"))
	{
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	}
	
	
	driver.manage().window().maximize();
	
	driver.get(URL);

	return driver;
	
	
	
}
	
	
	
	
	
	
	

}
