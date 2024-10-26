package week7.day1;

public class LearnFinal1{
	
	//Note:Final class cannot be extended
	
	public void launch() {
    System.out.println(1);
}
	public static void main(String[] args) {
		final int number=21;
	    //number=number+10;
		//System.out.println(number);
		LearnFinal1 lf=new LearnFinal1();
		lf.launch();
		
	}
}
