package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public  class LoginStepDefinition extends BaseClass{
	
	@Given("Load the url")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	}
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		driver=new ChromeDriver();
   }

	@When("Enter the username as {string}")
	public void enter_the_username_as_demo_csr(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	
	@When("It should throw error message")
	public void it_should_throw_error_message() {
	    System.out.println("It throws the error message");
	}

	@When("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
	   String valid = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
	if (valid.contains("Welcome")) {
		System.out.println("It was navigated to the next page");
	}
	else {
		System.out.println("Not Navigated");
	}
	}


}
