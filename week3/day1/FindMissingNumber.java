package week3.day1;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int a[] = {1,4,3,2,8,6,7}; //Declaring an Array with inputs
		Arrays.sort(a); //Given array has been sorted in ascending order
		
		for(int i = 0; i<a.length; i++) { //For loop has been used to iterate until the Array's length

				if(i+1 != a[i]) { //If condition is used to check if the numbers in the Array are matching with the iterable value or not
					
					System.out.println("The missing number is"+" "+(i+1));//Founded value is being printed 
					break;
				}
	}
			}
}


