package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class FindingIntersection {

	public static void main(String[] args) {
		
		//Arrays has been declared
		int a1[] = {3,2,11,4,6,7};
		int a2[] = {1,2,8,4,9,7};
		
		//List has been declared to store the values 
		List<Integer> list = new ArrayList<Integer>();
	
		//Nested Iteration loop has been created to iterate through the arrays
		for(int i=0; i<a1.length; i++) {
			
			for(int j =0; j<a2.length;j++ ) {
				
				//If conditional statement has been added to check if the values in both the arrays are matching
				if(a1[i]==a2[j]) {
					
					list.add(a1[i]);
				}
			}
			
		}
			
		System.out.println(list);

	}

}
