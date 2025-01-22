package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		//ArrayList has been created and the values has been added
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(10);
		array.add(6);
		array.add(8);
		
	    //size of the array is found
		int sizeOfArray = array.size();
		//ArrayList has been sorted in the ascending order
		Collections.sort(array);
		
		//New ArrayList has been created to store the missing Element
		List<Integer> newArray = new ArrayList<Integer>();
				
		//Iteration has been declared to compare the values in the ArrayList
		for(int i =0; i < sizeOfArray-1; i++) {

			//Logic to compare the Current Element and the Next Element
			int nextElement = array.get(i+1);
			int currentElement = array.get(i)+1;
			
			if(currentElement != nextElement ){
				
				newArray.add(currentElement);
			}

			}
		//Missing element has been printed
		System.out.println("Missing numbers are: "+newArray);

}
}

	


