package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String>mentors=new ArrayList<String>();
		
		mentors.add("Vinoth");
		mentors.add("Sarnaya");
		mentors.add("Anbu");
		mentors.add("Sakthi");
		mentors.add("Bhuvanesh");
		mentors.add("Muthu");
		mentors.add("Vineeth");
		mentors.add("Mukesh");
		//0-7
		//8
		
		System.out.println(mentors);
		
		//size
		int size = mentors.size();
		System.out.println(size);
		
		//my name inside in the my name in 2nd position
		mentors.add(2, "Dilip");
		System.out.println(mentors);
		
		mentors.add("Dilip");
		System.out.println(mentors);
		
		String string = mentors.get(5);
		System.out.println(string);
		
		boolean contains = mentors.contains("Anbu");
		System.out.println(contains);
		
		String remove = mentors.remove(9);
		
		System.out.println(mentors);
		
		
		//sort()
		Collections.sort(mentors);
		System.out.println(mentors);
		
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
			
			
			
		}
		
	
		mentors.clear();
		System.out.println(mentors);
		
		
		

	}

}
