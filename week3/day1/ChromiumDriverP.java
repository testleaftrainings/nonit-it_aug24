package week3.day1;

public class ChromiumDriverP extends RemoteWebDriverGP{

	public void chromedriver() {
		System.out.println("its coming from ChromiumDriver");
	}
	
	public static void main(String[] args) {
		ChromiumDriverP cd=new ChromiumDriverP();
		cd.chromedriver();
		cd.driver();
		
		
	}
}
