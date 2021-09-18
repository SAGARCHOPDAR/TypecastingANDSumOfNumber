package java_practice;

public class PalindromeExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r, sum=0, temp;
		int n=4554; // it is the number variable to be checked for palindrome
		
		temp=n;
		while(n>0) 
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
			
		}
		if (temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not plindrome");
	}

}
