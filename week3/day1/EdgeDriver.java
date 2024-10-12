package week3.day1;

public class EdgeDriver  extends ChromeDriverC{

	
	public void launchBrowser() {
		System.out.println("www.google.com");
	}
	
	public static void main(String[] args) {
	EdgeDriver ed=new EdgeDriver();
	ed.launchBrowser();
	}
	
}
