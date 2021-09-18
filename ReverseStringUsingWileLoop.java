package java_practice;

public class ReverseStringUsingWileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringinput="sagar chopdar";
		
		int stringlength=stringinput.length();
		
		while(stringlength>0)
		{
			System.out.print(stringinput.charAt(stringlength-1));
			
			stringlength--;
		}
	}

}
