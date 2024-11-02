package week8.day1;

public class LearnExceptionMultipleTryCatch {

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
		
		catch(Exception e1) {
		System.out.println(2);
		}
	}
}
