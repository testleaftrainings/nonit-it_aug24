package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {

		int even=20;
		//0,2,4,6,8,10,12,14,16,18,20
		//if condition
		//for loop
		
		for (int i = 0; i <=even; i++) {

			//if(i%2==0)
			if(i%2!=1) {
				System.out.println("Even numbers :"+i);
			}
		}
	}

}
