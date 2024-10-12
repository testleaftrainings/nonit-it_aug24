package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Dilip");

		driver.findElement(By.name("lastname")).sendKeys("Kumar");

		//webDriver methods
		//get title of the page
		String title = driver.getTitle();
		System.out.println(title);

		if(title.contains("Facebook")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
		}

		//getCurrentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		//text from application
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		//TestLeaf (10731)

		if (text.contains("TestLeaf")) {
			System.out.println("Lead is Created");
		} else {
			System.out.println("Lead is not Created");
		}

		driver.close();






	}

}
