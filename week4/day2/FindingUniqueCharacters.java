package week4.day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindingUniqueCharacters {

	public static void main(String[] args) {
		
        //Initialized companyName
		String companyName = "google";

		//Set has been created to remove duplicate values
		Set<Character> uniqueChar = new LinkedHashSet<Character>();
		
		//Iteration has been declared to iterate through the array
		for(int i = 0; i<companyName.length(); i++) {
			
			//Each unique Character is added to the Set
			uniqueChar.add(companyName.charAt(i));
		}
        //Unique characters has been printed
		System.out.println(uniqueChar);
		
	}

}
