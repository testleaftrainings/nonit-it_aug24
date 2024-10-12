package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//switch to 1st frame -outer frame
		driver.switchTo().frame(2);
		
		//switch to 2nd frame -inner frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		
		//move previous frame -1st
		driver.switchTo().parentFrame();
		
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//i[@class='pi pi-home layout-menuitem-icon']")).click();
		
	}

}
