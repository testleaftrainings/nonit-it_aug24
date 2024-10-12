package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement user = driver.findElement(By.id("username"));
		
		user.sendKeys("DemoSalesManager");
		Thread.sleep(3000);
		user.clear();
		Thread.sleep(2000);		
		user.sendKeys("DemoCsr");

		//NoSuchElementException - if mismatch attributeName and abttributValue
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//ctrl+2->2nd option
		//returnType for findElement is -> webEelement
		WebElement login= driver.findElement(By.className("decorativeSubmit"));
		login.click();

		//linktext - full value present in the dom
	//	driver.findElement(By.linkText("CRM/SFA")).click();
		
		//partialLinkText- partial value
		driver.findElement(By.partialLinkText("M/SFA")).click();
		
}
}