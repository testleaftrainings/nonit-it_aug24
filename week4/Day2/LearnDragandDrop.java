package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) {
	
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Load the url
		driver.get("https://jqueryui.com/droppable/");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, destination).perform();
		
	}

}
