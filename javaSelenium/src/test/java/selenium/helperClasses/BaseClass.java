package selenium.helperClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver=null;	
	public static WebElement element=null;

	public static void launchapplication(String browserType){

		if("chrome".equalsIgnoreCase(browserType)){
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();			
		}else if("firefox".equalsIgnoreCase(browserType)){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://my.naukri.com/account/createaccount");
		driver.manage().window().maximize();
	}


	public static String getCurrentDirecorty(){
		return System.getProperty("user.dir");
	}

}
