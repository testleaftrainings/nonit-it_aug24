package week8.day1;

public class LearnFinally {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int num[]= {1,2,3};
		try {
			//System.out.println(a/b);
			System.out.println(num[3]);
		} 
		
		catch (ArithmeticException e) {
			System.out.println(1);
		}
		
		finally {
		System.out.println("Completed");
		}
	}
}
