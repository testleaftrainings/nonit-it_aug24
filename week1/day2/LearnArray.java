package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int[] age= {23,56,21,45,32,67,90,12};
		
		//find length of the array
		//ctrl+2-> 2nd option
		int length = age.length;
		System.out.println("array length :"+length);
		
		//find last value in the array
		System.out.println(age[length-1]);
		//age[8-1]=>age[7]=>12
		
		//find first value in the array
		System.out.println("first value :"+age[0]);
		
		//find 2nd largest value
		//sorts
		Arrays.sort(age);
		//12,21,23,32,45,56,67,90
		
		System.out.println("find 2nd largest value :"+age[length-2]);
		
		System.out.println("Fine 2nd smallest Value :"+age[1]);
		
		
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
			
		}
		
	}

}
