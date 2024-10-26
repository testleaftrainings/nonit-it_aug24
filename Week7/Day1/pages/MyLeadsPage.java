package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public CreateLeadPage clickCreatelink() {
		 driver.findElement(By.linkText("Create Lead")).click();
         return new CreateLeadPage();
	}

}
