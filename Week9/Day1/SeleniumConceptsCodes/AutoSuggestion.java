package sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium Web");

		Thread.sleep(1000);

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));

		for (int i = 0; i < elements.size(); i++) {
			String value = elements.get(i).getText();

			if (value.equalsIgnoreCase("selenium webdriver architecture")) {
				elements.get(i).click();
				break;
			}

		}

	}
}
