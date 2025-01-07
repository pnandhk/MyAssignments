
package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		String companyName = "Testleaf";
		char a[] = companyName.toCharArray();
	
		
		for(int i = a.length-1 ; i>=0 ; i--) {
			System.out.println("Reversed Character is"+" "+a[i]);
		}
	
	}

}
