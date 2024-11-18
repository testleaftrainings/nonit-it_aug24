package week7.day1;

public class LearnStatic {
	
	static int number=7;
	
	
	public static void numberSystem() {
		System.out.println("Numbers");

	}
	
	static{
		numberSystem();
	}
	
	public static void main(String[] args) {
		//LearnStatic ls=new LearnStatic();
		//System.out.println(number);
		//ls.numberSystem();
		numberSystem();
		
	}

}
