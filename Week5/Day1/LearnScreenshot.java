package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		        //Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Maximize browser
				driver.manage().window().maximize();
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Take Screenshot of the entire page - Add Source
				  File source = driver.getScreenshotAs(OutputType.FILE);
				
				//Add Destination
				  File dest =new File("./Snaps/homepage.png");
				
				//Combine source and destination
		          FileUtils.copyFile(source, dest);
		          
		          
		          //To take screenshot of a WebElement
		          
		 
		          //To Find the element
		            WebElement textField = driver.findElement(By.id("username"));
		          
		           // Take Screenshot of the WebElement
		          File source1 = textField.getScreenshotAs(OutputType.FILE);
		          
		        //Add Destination
	              File dest2=new File("./Snaps/UsernameField.png");
	
	             //Combine source and destination
	              FileUtils.copyFile(source1, dest2);
	}

}
