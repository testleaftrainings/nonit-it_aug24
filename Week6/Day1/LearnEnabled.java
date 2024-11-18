package week6.day1;

import org.testng.annotations.Test;

public class LearnEnabled {
	
	// 0  1   3
	//  -2 -1 0
	
	@Test(priority=-1, enabled=false)
	public void sendMail() {
		System.out.println("sendMail");

	}
	
	@Test
	public void clickComposeButton() {
		// TODO Auto-generated method stub
		System.out.println("clickComposeButton");
	}
    
	@Test(priority=1)
	public void loginGmail() {
		// TODO Auto-generated method stub
		System.out.println("loginGmail");
	}
	
	
	
	
	

}
