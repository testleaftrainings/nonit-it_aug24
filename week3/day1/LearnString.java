package week3.day1;

public class LearnString {

	public static void main(String[] args) {

		String name="TestLeaf";
		
		String comName=new String("Testleaf");
		
		//length() of the String
		
		int charCount = name.length();
		
		System.out.println("Number of chars :"+charCount);
		
		
		//equals
		if(name.equals(comName)) {
			System.out.println("its equals() ");
		}else {
			System.out.println("not equals()");
		}
		
		
	
		
		
		//equalsIngoreCase
		if(name.equalsIgnoreCase(comName)) {
			System.out.println("its equalIgnoreCase");
		}else {
			System.out.println("its not equalIgnoreCase");
		}
		
		//b/w == and .equals()
		//== -> memory address of string value
		if(name==comName) {
			System.out.println("its ==");
		}else {
			System.out.println("not ==");
		}
	
		String n="Testleaf";
		if(name==n) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		
		//contains
		
		boolean contains = n.contains("Tte");
		System.out.println(contains);
		
		//charAt -> index start from '0'
		char charAt = n.charAt(5);
		System.out.println(charAt);
		
		
		//tocharArrya
		String value="Selenium";
	
		char[] ch = value.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		//reserve the String
		String data="Selenium";
		//avaJ
		char[] ch1 = data.toCharArray();
		
		for (int i = ch1.length-1; i >=0 ; i--) {
			System.out.print(ch1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		}

}
