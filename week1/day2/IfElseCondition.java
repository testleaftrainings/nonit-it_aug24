package week1.day2;

public class IfElseCondition {

	public static void main(String[] args) {

		int mark=50;
		
		//if(50>=80)-f
		if(mark>=80) {
			System.out.println("A");
		}//else if(50>=65) -f
		else if(mark>=65) {
			System.out.println("B");
		}//else if(50>=50)-t
		else if(mark>=50) {
			System.out.println("C");
		}else if(mark>40) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
		
			}

}
