package week1.day2;

import java.util.Arrays;

public class FindDuplicateValue {

	public static void main(String[] args) {

		int[] data= {34,45,12,23,90,67,90,23,22};
		
		//for loop -nested for loop
		//if condition
		//print the duplicate value
		
		//outer for loop -data[0]-34
		for (int i = 0; i < data.length; i++) {
			
			//inner for loop
			//data[0+1]=data[1]=45
			for (int j = i+1; j < data.length; j++) {
				
				
				if(data[i]==data[j]) {
					System.out.println("Duplicate value is :"+data[j]);
				}
			}
		}
			Arrays.sort(data);
			//12,22,23,23,34,45,67,90,90
			for (int i = 0; i < data.length-1; i++) {
				if(data[i]==data[i+1]) {
					System.out.println("duplicate value :"+data[i+1]);
			}
		}
	}

}
