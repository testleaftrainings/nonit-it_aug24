package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet1 {

	public static void main(String[] args) {

		int[] num= {2,4,3,6,2,7,9,4,9,5,2};
		
		//remove duplicate value and sort
		//print what value is presented in index 3
		
		Set<Integer> value=new TreeSet<Integer>();
		
		//for each loop - collection(List ,Set)
		//for each  loop- no need inti ,cond,incr/decr
		
//		for (int i = 0; i < num.length; i++) {	
//		}
		
		//for each loop
		// WC  Declare variable : num
		//Integer i : num
		for (Integer i : num) {
			value.add(i);
		}
		
		System.out.println(value);
		
		//convert set into list
		
		List<Integer> indexvalue=new ArrayList<Integer>(value);
		
		Integer integer = indexvalue.get(3);
		
		System.out.println(integer);
		
		
		
		
	}

}
