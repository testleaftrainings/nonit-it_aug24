package week8.day1;

public class LearnThrows {
	
	
	public void calculation() throws Exception {
		
			   int a=10/1;
		       System.out.println(a);
		
		
	}
	

	public static void main(String[] args) {
		LearnThrows cal=new LearnThrows();
		try {
			cal.calculation();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
