package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0; 
		int b = 1;
for (int i = 0; i<8; i++) {
	
	System.out.println("Fibonacci series is"+" "+a);
	
	int c = a+b;
	a=b;
	b=c;

}


	}

}
