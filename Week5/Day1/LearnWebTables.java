package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTables {

	            public static void main(String[] args) {
		        
	            //Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//Load the url
				driver.get("https://leafground.com/table.xhtml");
				
				//Maximize browser
				driver.manage().window().maximize();
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				//To locate the table
				WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
				
				
				//To count the number of rows
				List<WebElement> allElements = table.findElements(By.tagName("tr"));
				int rowCount = allElements.size();
				System.out.println("Row count is: "+rowCount);
				
				
				List<WebElement> column = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
	            int columnCount = column.size();
				System.out.println("ColumnCount is :"+columnCount);
				
				
				//To Retrieve entire row value
				List<WebElement> row1Elements = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
				int size = row1Elements.size();
				for (int i = 0; i < size; i++) {
					String text = row1Elements.get(i).getText();
					System.out.println("row1Elements are: "+text);
				}
				
			
				//To retrieve all the data
				
				//Row1  col1   col2
				//Row2  col1   col2
				
				//
				for (int i = 1; i <= rowCount; i++) {
					WebElement row = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
					  for (int j = 1; j <= columnCount; j++) {
		             String allElementsText = row.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println("All elements are: "+allElementsText);
					}
	      }
     }
}
