package week3.day1;

public class FindingIntersection {

	public static void main(String[] args) {
	
		int a[] = {3,2,11,4,6,7}; //Two arrays with numerical values has been declared
		int b[] = {1,2,8,4,9,7};
		
		
		for(int i=0; i<a.length; i++) { //For loop has been implemented for iterating first array a[]
			
			for(int j=0; j<b.length;j++) { //Nested For loop has been implemented for iterating the second array b[]
				
				if(a[i]==b[j]) { //If condition has been used to find if there is an intersection in both the arrays
					
					System.out.println("The numbers in the array are matching with each other"+" "+a[i]);
					
					//Print statement has been added if there is a match in the array elements
				}
			}
		}
	}

}
