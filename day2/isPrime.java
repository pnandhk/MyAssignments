package week1.day2;

public class isPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				System.out.println(+n+" is not a prime number");
				break;
				}
				else
				{
					System.out.println(+n+" is a prime number");
				}
			}
	}

}
