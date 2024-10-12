package week3.day2;
 //class and abstract class -> extends

public class SBIChennai extends SBIHQ {

	public void openAcct() {
System.out.println("Pan card");		
	}

	public void loan() {
System.out.println("PL");		
	}

	
	public void minbalance() {
System.out.println("5000rs");		
	}

	public static void main(String[] args) {
		
		SBIChennai sc=new SBIChennai();
		sc.deposits();
		sc.loan();
		sc.minbalance();
		sc.openAcct();
		
	}
	
}
