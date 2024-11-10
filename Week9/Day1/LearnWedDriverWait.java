package week9.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWedDriverWait {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
         //Load the URL
		driver.get("https://leafground.com/waits.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Instantiate the WebDriverWait class
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Write the explicit for the element to be clickable
		WebElement firstElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		
		//Click the element
		firstElement.click();
		
		//Write the explicit for the element to be visible
	      WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
	    //Check whether the element is displayed or not
	      boolean displayed = until.isDisplayed();
	      System.out.println(displayed);
	      
	      
	      //Write the explicit for the element to be clickable
	      WebElement secondElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]")));
	      secondElement.click();
	      
	      //Write the explicit for the element to be invisible
	      Boolean invisibleWE = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
	      System.out.println("Invisible element: "+invisibleWE);
		
		 //Window 
		 driver.get("https://www.leafground.com/window.xhtml");
		
		//Write the explicit for the element to be clickable
		  WebElement multipleWindow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Open Multiple']")));
		  multipleWindow.click();
		
		
		//To check how many windows are opened
		Boolean windowsValue = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(windowsValue);
	}

}
