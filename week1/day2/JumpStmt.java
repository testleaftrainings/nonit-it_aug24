package week1.day2;

public class JumpStmt {

	public static void main(String[] args) {
	
		int value=10;
		
		for (int i = 0; i <value; i++) {
			
			if(i==7) {
				break; //it will stop my program
			}
			System.out.println(i);
		}
		
		System.out.println("*****************");
		
		
		for (int i = 0; i <value; i++) {
			if(i==5) {
				continue;//skip the rest of the loop when i is 5
				//skip current value and jump to the next value
			}
			System.out.println(i);
		}
	}

}
