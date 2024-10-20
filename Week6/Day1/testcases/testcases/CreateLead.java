package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{
	
   @BeforeTest
    public void setvalues() {
	fileName="CreateLead";

   }
	 
//                0                                  1
//	{  {"Testleaf","Vineeth", "rajendran"} ,{"Qeagle", "Hari", "R"}   }
//           0         1            2             0        1     2
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String companyName, String firstName, String lastName) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






