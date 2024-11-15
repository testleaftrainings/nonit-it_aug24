package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnInteractionWithImage {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	        // Navigate to the web page
	        driver.get("https://www.w3schools.com/html/html_images.asp");

	        // Locate the image element using the 'img' tag and its attributes (like class, id, etc.)
	        WebElement imageElement = driver.findElement(By.xpath("//img[@src='images/yt_logo_rgb_dark.png']"));
	        driver.executeScript("arguments[0].scrollIntoView();", imageElement);
	        // Get the 'src' attribute of the image
	        String imageUrl = imageElement.getAttribute("src");
	        System.out.println("Image Source URL: " + imageUrl);

	        // Optionally, you can interact with the image or perform other actions here
	        
	        // For example, clicking on the image (if it's clickable)
	        imageElement.click();

	        // Close the browser
	        driver.quit();
	}

}
