package week1.day2;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       System.out.print("Enter the input number: ");
		
		Scanner getInput = new Scanner(System.in);
		
		// Read and store the input integer
		int input = getInput.nextInt();
		int temp,output =0;
		
		for(temp = input; temp>0 ; temp=temp/10) {
			
          output = (output*10)+(temp%10); 
				
				}
		if(input==output)
		{
			System.out.println("The given number is a Palindrome");
		}
		else
		{
			System.out.println("The given number is not a Palindrome");
		}
		
		}
}

