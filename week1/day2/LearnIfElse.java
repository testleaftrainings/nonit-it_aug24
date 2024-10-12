package week1.day2;

public class LearnIfElse {

	public static void main(String[] args) {

		//int num=0;
		int num=0;
		//if condition ->if - Press ctrl+space
		//if(0>0)-false
		if (num>0) {
			System.out.println("positive number :"+num);
		}
		
		else if(num==0) {
			System.out.println("Neutral Value : "+num);
		}
		
		else {
			System.out.println("Number negative :"+num);
		}
		
		//nested if 
		
		if(num>=0) { //acc no
			
			if(num>3) {//name
				
				if(num>5) {
					//mobile
				}
			}
		}else if(num==-1) {
			
		}
		
	}

}
