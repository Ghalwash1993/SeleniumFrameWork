package ghuru;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testghuru extends utils{

	public static WebDriver driver ;

	@BeforeTest
	public static void startDriver() throws IOException 
	{
		String chromepath = System.getProperty("user.dir")+"/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver(); 
		driver.navigate().to("http://live.demoguru99.com/index.php/");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void closeurl()
	{
		//driver.quit();
	}
	
	

}
