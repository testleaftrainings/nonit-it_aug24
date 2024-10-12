package week3.day2;

public class LearnString {

	public static void main(String[] args) {

		String input="Selelnium Motherhood Language is Java";
		
		//o/p -> SeleniumMotherhoodLanguageisJava
		
		String[] split = input.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		System.out.println();
		
		String value="Java";
		String replace = value.replace('a', '!');
		
		System.out.println(replace);
		
		
		String val="Amazon have Launched 1000 new Product @";
		String replaceAll = val.replaceAll("[^0-9A-Za-z]", "1");
		
		System.out.println(replaceAll);
		
		
		String name="take screenshot";
		String substring = name.substring(5);
		System.out.println(substring);
		
		
		String substring2 = name.substring(2, 8);
		System.out.println(substring2);
		
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		String amt="4000";
		System.out.println(amt);
		//String value into int
		int parseInt = Integer.parseInt(amt);
		System.out.println(parseInt);
		
		
		
		
	}

}
