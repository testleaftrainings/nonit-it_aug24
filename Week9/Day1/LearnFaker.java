package week9.day1;

import com.github.javafaker.Faker;

public class LearnFaker {

	public static void main(String[] args) {
		
		Faker fak=new Faker();
		String firstName = fak.name().firstName();
		System.out.println(firstName);
		String companyName = fak.company().name();
        System.out.println("Company name is: "+companyName);
        
        //To generate email
        String emailAddress = fak.internet().emailAddress();
        System.out.println(emailAddress);
        
     }

}
