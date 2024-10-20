package week6.day1;

import org.testng.annotations.Test;

public class LearnPriority {
	
	@Test(priority=-1)
	public void sendMail() {
		System.out.println("sendMail");
    }
	
	@Test
	public void clickComposeButton() {
		System.out.println("clickComposeButton");
	}
    
	@Test(priority=1)
	public void loginGmail() {
		System.out.println("loginGmail");
	}
	
}
