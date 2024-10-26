package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		}
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
}
