package week1.day2;

public class LearnMethod {

	//accessModifier returnType methodName(Input args)
	//if you have create input parameter ,pass value inside method
	public void browserVersion() {
		System.out.println("Browser version is : 129.34");
	}
	
	//default
	void browserName(String name) {
		System.out.println(name);
	}
	
	//private
	private int cardPinNo() {
		return 2847;
		
	}
	
	public static void main(String[] args) {
		//Classname objectname=new ClassName();
		LearnMethod lc=new LearnMethod();
		
		//objectName.methodName();
		lc.browserName("Chrome");
		
		lc.browserVersion();
		
		//if You have declare as dataType
		//store in the local variable
		//syso(ob.method())
		//ctrl+2=l
		
		int cardPinNo = lc.cardPinNo();
		System.out.println(cardPinNo);
		
		System.out.println(lc.cardPinNo());
		
	}
	
	
	
}
