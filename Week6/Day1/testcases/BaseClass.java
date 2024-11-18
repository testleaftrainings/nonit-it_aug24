package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;
	public String fileName;
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preCondition(String browser,String url, String username, String password ) {
		
		if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
		}
		
		
		
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		return ReadExcel.readData(fileName);

	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	

}
