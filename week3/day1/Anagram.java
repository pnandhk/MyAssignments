package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 ="stops"; //Initializing String "stops" to a variable text1
		String text2 ="potss"; //Initializing String "potss" to a variable text1
		
		int text1Length = text1.length(); //Found the length of text1 using length() method
		int text2Length = text2.length(); //Found the length of text1 using length() method
		
		if(text1Length == text2Length) {   //Comparing if the text1 and text2 length are equal using IF condition
			
		char[] text1CharArray = text1.toCharArray(); //Converting the text1 and text2 to Character Array using toCharArray() method
		char[] text2CharArray = text2.toCharArray(); 
		
		Arrays.sort(text1CharArray); // Using sort method sorted both the Arrays
		Arrays.sort(text2CharArray);
		
		for(int i=0; i< text1Length && i< text2Length; i++) { //Implemented a for loop to iterate all the values inside the Character Array
			
			if(text1CharArray[i]==(text2CharArray[i])) { //If condition with == operator is used to find if the char in both arrays are equal
				System.out.println("The characters in both arrays are equal"+" "+text1CharArray[i]);
			}
			}
		}
		else {
			
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			}
		}

}
