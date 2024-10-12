package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindsDuplicateNumbers {

	public static void main(String[] args) {

		int[] num= {23,54,23,12,56,34,21,78,32,27,67,43,56};
		
		List<Integer> unq=new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			unq.add(num[i]);
		}
		
		
		System.out.println(unq);
		Collections.sort(unq);
		System.out.println(unq);
		for (int i = 0; i < unq.size()-1; i++) {
			if(unq.get(i)==unq.get(i+1)) {
				System.out.println("Duplicate values :"+unq.get(i+1));
			}
		}
		
		
			
		
	}

}
