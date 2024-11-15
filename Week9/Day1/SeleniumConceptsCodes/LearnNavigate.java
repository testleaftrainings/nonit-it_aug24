package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNavigate {

	public static void main(String[] args) {
		//Initialize Webdriver
		ChromeDriver driver = new ChromeDriver();
		
		//Loadurl
		driver.get("http://leaftaps.com/opentaps/.");
		//In Selenium WebDriver, navigation can be managed using the Navigate interface through the driver.navigate() method.
		//This interface provides a variety of methods to interact with the browser's navigation controls.
		// 1.to(String url)
		driver.navigate().to("https://en-gb.facebook.com/");
		
		//It behaves similarly to driver.get(url), but to() is part of the Navigate interface, while get() is from the WebDriver interface.

        //2. back()
		//Simulates the browser’s back button. It navigates to the previous page in the browser’s history.
		driver.navigate().back();
		
		//3. forward()
		//Simulates the browser’s forward button. It navigates forward in the browser’s history.
		driver.navigate().forward();
		
		//4. refresh()
		//Refreshes the current page, simulating the browser's refresh button.
		driver.navigate().refresh();
	}

}
