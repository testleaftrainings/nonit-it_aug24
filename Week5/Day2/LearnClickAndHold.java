package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClickAndHold {

	public static void main(String[] args) {
		
		//Launch the browser
        ChromeDriver driver =new ChromeDriver();
		
		//Load the url
		driver.get("https://jqueryui.com/selectable/");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		WebElement firstElement = driver.findElement(By.xpath("//li[text()='Item 1']"));

		WebElement secondElement = driver.findElement(By.xpath("//li[text()='Item 2']"));
	
	    Actions act=new Actions(driver);
	
	   act.clickAndHold(firstElement).clickAndHold(secondElement).perform();
	
	}

}
