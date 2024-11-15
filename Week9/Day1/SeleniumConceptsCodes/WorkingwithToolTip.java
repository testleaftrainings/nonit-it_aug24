package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithToolTip {
	/*
	 * A Tooltip is a small pop-up box that appears when a user hovers over or
	 * focuses on an element in a user interface(UI), providing additional
	 * information or guidance about that element. It helps users understand the
	 * function or purpose of buttons, icons, and other UI components without
	 * cluttering the interface
	 */

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mapz.com/map");

		driver.findElement(By.xpath("//a[contains(text(),'Draw')]")).click();
		Actions act = new Actions(driver);
		WebElement email = driver.findElement(By.xpath("(//input[@id='email'])[1]"));

		Thread.sleep(2000);
		act.moveToElement(email).perform();
		String tooltip = email.getAttribute("validationMessage");
		System.out.println("Email ToolTip Message : " + tooltip);

	}

}
