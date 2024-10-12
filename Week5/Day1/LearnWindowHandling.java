package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/window.xhtml");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click the open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//To get the address of the parent window
		  String parentWindow = driver.getWindowHandle();
		  System.out.println("Parent address is "+parentWindow);
		  //80B3736B08D0E2B2300B3C219B864026
		
       
		//To get the address of all opened windows
		  Set<String> allOpenedAddress = driver.getWindowHandles();
		  System.out.println("Address of all opened address "+allOpenedAddress);

	      //Convert set into List
		  //Declare empty list
		
		List<String> allAdresses= new ArrayList<String>(allOpenedAddress);
		
		//Get Title
		String parentTitle = driver.getTitle();
		System.out.println("Parent title is: "+parentTitle);
		
		//Switch from parent to child
		 driver.switchTo().window(allAdresses.get(1));
		 
		 //Get title
		 String childWindow = driver.getTitle();
		 System.out.println("Child window is: "+childWindow);
		 
		 //Close the browser
		 driver.close();
		 
		 
		 //Transfer the driver the focus to parent
		 driver.switchTo().window(allAdresses.get(0));
		 
		 //Get title
		  String title = driver.getTitle();
		  System.out.println("Title is: "+title);
	}
}
