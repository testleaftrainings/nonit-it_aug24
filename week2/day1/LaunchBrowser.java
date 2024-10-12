package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		//open the empty browser
		//ctrl+shift+o 
		ChromeDriver driver=new ChromeDriver();
		//load the url 
		driver.get("https://www.testleaf.com");
		
		//Maximize screen
		driver.manage().window().maximize();
			
		//java wait - thread.sleep
		Thread.sleep(5000);

		//close browser 
		driver.close();
		
		
		
		
	}

}
