package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadDefinition extends BaseClass{
	

@When("Click on the Crmsfa link")
public void click_on_the_crmsfa_link() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}

@When("Click on the leads link")
public void click_on_the_leads_link() {
	driver.findElement(By.linkText("Leads")).click();
}


@When("Click on the login button")
public void click_on_the_login_button() {
	driver.findElement(By.className("decorativeSubmit")).click();
}

@When("Click on the Createleads link")
public void click_on_the_createleads_link() {
	driver.findElement(By.linkText("Create Lead")).click();
}

@When("Enter the companyname as (.*)$")
public void enter_the_companyname_as_test_leaf(String companyName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);   
}

@When("Enter the firstname as (.*)$")
public void enter_the_firstname_as_vineeth(String firstname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
}

@When("Enter the lastname as (.*)$")
public void enter_the_lastname_as_rajendran(String lastName) {
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
}

@When("Click on the CreateLeadButton")
public void click_on_the_create_lead_button() {
	driver.findElement(By.name("submitButton")).click();
}

@Then("Lead should be created")
public void lead_should_be_created() {
    System.out.println("Lead is created");
}

}
