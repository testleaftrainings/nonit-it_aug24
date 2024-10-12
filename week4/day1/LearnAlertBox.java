package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertBox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//simple alert box
		WebElement clickButton = driver.findElement(By.xpath("//span[text()='Show']"));
		clickButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		//read text alert box
		String text = alert.getText();
		System.out.println(text);
		
		//accept
		alert.accept();
		
	Thread.sleep(5000);
		//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//read text alert box
		String text2 = alert.getText();
		System.out.println(text2);
		
		//cancel
		//alert.dismiss();
		
		String text3 = driver.findElement(By.id("result")).getText();
		System.out.println(text3);
		
	//	alert.sendKeys("");
	//	alert.dismiss();
	//	print text application
		
	//driver.close();
		
		
		Thread.sleep(5000);
		//sweet alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(3000);
		//alert.accept();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
	
		//Exception:
		// 1.NoAlertPresentException 
		// 2.UnhandledAlertException
		
		
		
		
		
		
	}

}
