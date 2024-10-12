package week3.day1;

public class ChromeDriverC extends ChromiumDriverP{

	
	public void launchBrowser() {
		System.out.println("its coming from chromeDriver");
	}
	
	public static void main(String[] args) {
		ChromeDriverC c=new ChromeDriverC();
		c.chromedriver();
		c.driver();
		c.launchBrowser();
	}
}
