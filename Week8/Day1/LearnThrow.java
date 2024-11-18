package week8.day1;

public class LearnThrow {
	
	public static void main(String[] args) {
		int age=-1;
		if (age<1) {
			throw new ArithmeticException("Age is invalid");
		}
		else if(age>1) {
			System.out.println("Customer's age is:" +age);
		}
	}

}
